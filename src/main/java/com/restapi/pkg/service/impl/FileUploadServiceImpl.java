package com.restapi.pkg.service.impl;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.restapi.pkg.model.FileDB;
import com.restapi.pkg.repository.FileRespository;
import com.restapi.pkg.service.FileUploadService;
import org.springframework.util.StringUtils;

@Service
public class FileUploadServiceImpl implements  FileUploadService {

	
	@Autowired
	FileRespository fileRepository;
	
	
	@Override
	public FileDB store(MultipartFile file) throws IOException {
		// TODO Auto-generated method stub
		
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	    FileDB FileDB = new FileDB(fileName, file.getContentType(), fileName, file.getBytes());
		
		return fileRepository.save(FileDB);
	}

	@Override
	public FileDB getFile(String id) {
		// TODO Auto-generated method stub
		return fileRepository.findById(id).get();
	}

	@Override
	public Stream<FileDB> getAllFiles() {
		// TODO Auto-generated method stub
		return fileRepository.findAll().stream();
	}

	
	
}
