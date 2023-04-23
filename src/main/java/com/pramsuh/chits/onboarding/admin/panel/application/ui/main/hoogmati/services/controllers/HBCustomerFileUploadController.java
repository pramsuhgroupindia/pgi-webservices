package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.models.HBCustomerDatabaseFile;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.repositories.HBCustomerDatabaseFileRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.hoogmati.services.workers.HoogmaticBorrowerFileStorageService;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.workers.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/hoogmatic/financial/web/services/borrower/files/uploading")
public class HBCustomerFileUploadController {

    @Autowired
    private HoogmaticBorrowerFileStorageService fileStorageService;

    @Autowired
    HBCustomerDatabaseFileRepository databaseFileRepository;
    @PostMapping("/uploadFile")
    public Response uploadFile(@RequestParam("file") MultipartFile file ) {
        String fileName = fileStorageService.storeFile(file);
        String aadhar = fileName.substring(0, 12);
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/api/v1/hoogmatic/financial/web/services/borrower/downloadFile/")
                .path(fileName)
                .toUriString();
        HBCustomerDatabaseFile databaseFile = new HBCustomerDatabaseFile();
        databaseFile.setAadhar(aadhar);
        databaseFile.setFileName(fileName);
        databaseFile.setFileType(file.getContentType());
        databaseFile.setFileDownloadUri(fileDownloadUri);
        databaseFile.setSize(file.getSize());
        databaseFileRepository.save(databaseFile);
        return new Response(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
    }

    @PostMapping("/uploadMultipleFiles")
    public List<Response> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        return Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(file))
                .collect(Collectors.toList());
    }
}