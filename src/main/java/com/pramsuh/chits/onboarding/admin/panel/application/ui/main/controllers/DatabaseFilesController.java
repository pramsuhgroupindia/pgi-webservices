package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.controllers;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.AllClosedChitGroups;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.DatabaseFile;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.AllClosedChitGroupsRepository;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.DatabaseFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chit/funds/web/services/customer/database/files")
public class DatabaseFilesController {
    @Autowired
    DatabaseFileRepository databaseFileRepository;

    @GetMapping("/all")
    public ResponseEntity<List<DatabaseFile>> findAllFiles() {
        return new ResponseEntity<List<DatabaseFile>>(databaseFileRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/all/{aadhar}")
    public ResponseEntity<List<DatabaseFile>> findAllFilesByAadhar(@PathVariable String aadhar) {
        return new ResponseEntity<List<DatabaseFile>>(databaseFileRepository.findAllFilesByAadhar(aadhar), HttpStatus.OK);
    }

}
