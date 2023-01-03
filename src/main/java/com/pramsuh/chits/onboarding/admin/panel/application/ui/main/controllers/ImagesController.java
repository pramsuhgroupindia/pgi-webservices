package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.interfaces.FilesStorageService;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.FileDB;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.RegistrationDetails;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.ResponseFile;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.ResponseMessage;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.FilesDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/web/services/customer/signup/kyc")
public class ImagesController {

    @Autowired
    FilesDbRepository imagesRepository;
    @Autowired
    FilesStorageService storageService;

    @PostMapping(value="/upload", consumes="*/*")
    public ResponseEntity<ResponseMessage> uploadFiles(@RequestBody RegistrationDetails details,
                                                       @RequestParam("AADHAR") MultipartFile aadhar,
                                                       @RequestParam("PAN") MultipartFile pan,
                                                       @RequestParam("ADDRESS") MultipartFile address) {
        String message = "";
            try{
                storageService.save(aadhar, details.getMobileNumber(), "aadhar");
                message = "1 .Uploaded the file successfully: " + aadhar.getOriginalFilename();
            }catch (Exception e) {
                message = "Could not upload the file: " + aadhar.getOriginalFilename() ;
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
            }
            try{
                storageService.save(pan, details.getMobileNumber(), "pan");
                message = message+" 2.Uploaded the file successfully: " + pan.getOriginalFilename();
            }catch (Exception e) {
                message = "Could not upload the file: " + pan.getOriginalFilename() ;
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
            }
            try{
                storageService.save(address, details.getMobileNumber(), "address");
                message = message+" 3. Uploaded the file successfully: " + address.getOriginalFilename();
            }catch (Exception e) {
                message = "Could not upload the file: " + address.getOriginalFilename() ;
                return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
            }
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("UPLOADED"));
    }

    @GetMapping("/files")
    public ResponseEntity<List<ResponseFile>> getListFiles() {
        List<ResponseFile> files = storageService.getAllFiles().map(dbFile -> {
            String fileDownloadUri = ServletUriComponentsBuilder
                    .fromCurrentContextPath()
                    .path("/files/")
                    .path(String.valueOf(dbFile.getId()))
                    .toUriString();

            return new ResponseFile(
                    dbFile.getName(),
                    fileDownloadUri,
                    dbFile.getType(),
                    dbFile.getImage().length);
        }).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(files);
    }

    @GetMapping("/files/{id}")
    public ResponseEntity<byte[]> getFile(@PathVariable String id) {
        FileDB fileDB = storageService.getFile(Long.valueOf(id));
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getName() + "\"")
                .body(fileDB.getImage());
    }
}

