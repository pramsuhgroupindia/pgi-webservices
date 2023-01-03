package com.pramsuh.chits.onboarding.admin.panel.application.ui.main.interfaces;

import com.pramsuh.chits.onboarding.admin.panel.application.ui.main.models.profile.FileDB;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Stream;
public interface FilesStorageService {

    public void init(String mobileNumber, String tag);

    public void save(MultipartFile file, String mobileNumber, String tag);

    public Resource load(String filename);

    public void deleteAll();

    public Stream<Path> loadAll();

    public FileDB store(MultipartFile file) throws IOException;

    public FileDB getFile(Long id);

    public Stream<FileDB> getAllFiles();

}
