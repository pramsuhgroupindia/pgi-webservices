package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.fasterxml.jackson.databind.util.NativeImageUtil;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.Images;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.profile.repositories.ImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/web/services/signup")
public class ImagesController {

    @Autowired
    ImagesRepository imagesRepository;

    @PostMapping("/upload/images")
    public ResponseEntity<Images>  uploadImage(@RequestParam MultipartFile file) throws IOException{
        Images images = Images.builder().name("20M5L.png").type(".png").image(file.getBytes()).build();
        imagesRepository.save(images);
        return ResponseEntity.status(HttpStatus.OK).body(images);
    }

}
