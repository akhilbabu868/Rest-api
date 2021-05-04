package com.restapi.pkg.controller;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.restapi.pkg.model.FileDB;
import com.restapi.pkg.service.FileUploadService;

@RestController
public class FileUploadController {

	
	
	@Autowired
	private FileUploadService fileUploadService;
	
//	
	@PostMapping("/upload")
	public FileDB uploadFile(@RequestParam("file") MultipartFile file) throws IOException {

		FileDB files=	fileUploadService.store(file);
		return files;
	}
	
	
	
	
	@GetMapping("file/getAll")
	public Stream<FileDB> getFiles(){
		
		return fileUploadService.getAllFiles();
		
	}
	
	
	
	@GetMapping("file/getById/{id}")
	public FileDB getById( @PathVariable("id") String fileId){
		
		FileDB files=	fileUploadService.getFile(fileId);
		return files;
		
	}
}
