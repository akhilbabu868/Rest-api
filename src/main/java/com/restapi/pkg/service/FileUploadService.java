package com.restapi.pkg.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.web.multipart.MultipartFile;

import com.restapi.pkg.model.FileDB;

public interface FileUploadService {
	
	 public FileDB store(MultipartFile file) throws IOException;
	 
	 public FileDB getFile(String id);
	 
	 
	 public Stream<FileDB> getAllFiles();
}

