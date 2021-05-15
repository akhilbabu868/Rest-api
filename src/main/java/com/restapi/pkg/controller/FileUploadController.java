package com.restapi.pkg.controller;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;

import com.restapi.pkg.model.FileDB;
import com.restapi.pkg.service.FileUploadService;

@RestController
public class FileUploadController {

	
	
	@Autowired
	private FileUploadService fileUploadService;
	
	
	
	
	@RequestMapping("/view")
	public ModelAndView mv() {
		
		ModelAndView view = new ModelAndView("index");
		return view;
		
	}
	
	
	
	
//	
	@PostMapping("/upload")
	public FileDB uploadFile(@RequestParam("file") MultipartFile file) throws IOException {

		FileDB files=	fileUploadService.store(file);
		return files;
	}
	
	
	
//	  @GetMapping("/files")
//	  public ResponseEntity<List<ResponseFile>> getListFiles() {
//	    List<ResponseFile> files = fileUploadService.getAllFiles().map(dbFile -> {
//	      String fileDownloadUri = ServletUriComponentsBuilder
//	          .fromCurrentContextPath()
//	          .path("/files/")
//	          .path(dbFile.getId())
//	          .toUriString();
//
//	      return new ResponseFile(
//	          dbFile.getName(),
//	          fileDownloadUri,
//	          dbFile.getType(),
//	          dbFile.getData().length);
//	    }).collect(Collectors.toList());
//
//	    return ResponseEntity.status(HttpStatus.OK).body(files);
//	  }
//	
//	  
//	  
//	    @GetMapping("/downloadFile/{fileId}")
//	    public ResponseEntity<Resource> downloadFile(@PathVariable String fileId) {
//	        // Load file from database
//	    	FileDB dbFile = fileUploadService.getFile(fileId);
//
//	        return ResponseEntity.ok()
//	                .contentType(MediaType.parseMediaType(dbFile.getType()))
//	                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + dbFile.getName() + "\"")
//	                .body(new ByteArrayResource(dbFile.getData()));
//	    }

	  
	
	
	@GetMapping("file/getById/{id}")
	public FileDB getById( @PathVariable("id") String fileId){
		
		FileDB files=	fileUploadService.getFile(fileId);
		return files;
		
	}
}
