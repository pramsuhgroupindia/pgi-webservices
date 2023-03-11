package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.workers;
import java.io.IOException;
import java.time.LocalDateTime;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.DatabaseFile;
import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.repositories.DatabaseFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DatabaseFileService {

    @Autowired
    private DatabaseFileRepository dbFileRepository;

    public DatabaseFile storeFile(MultipartFile file) {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        // Check if the file's name contains invalid characters
        if(fileName.contains("..")) {
            throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
        }

        DatabaseFile dbFile = new DatabaseFile();
        dbFile.setFileType(dbFile.getFileType());
        dbFile.setFileName(dbFile.getFileName());
        dbFile.setFileDownloadUri(dbFile.getFileDownloadUri());
        dbFile.setSize(dbFile.getSize());
        dbFile.setNow(LocalDateTime.now());
        dbFile.setNow(dbFile.getNow());

        return dbFileRepository.save(dbFile);
    }

    public DatabaseFile getFile(long fileId) {
        return dbFileRepository.findById(fileId)
                .orElseThrow(() -> new FileNotFoundException("File not found with id " + fileId));
    }
}
