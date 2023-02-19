package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.DatabaseFile;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.DatabaseFileRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.workers.FileStorageService;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.workers.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/customer/files/uploading")
public class FileUploadController {

    @Autowired
    private FileStorageService fileStorageService;

    @Autowired
    DatabaseFileRepository databaseFileRepository;
    @PostMapping("/uploadFile")
    public Response uploadFile(@RequestParam("file") MultipartFile file ) {
        String fileName = fileStorageService.storeFile(file);
        String aadhar = fileName.substring(0, 12);
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/api/v1/chit/funds/web/services/customer/downloadFile/")
                .path(fileName)
                .toUriString();
        DatabaseFile databaseFile = new DatabaseFile();
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