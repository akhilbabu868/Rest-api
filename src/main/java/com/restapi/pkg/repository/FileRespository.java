package com.restapi.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.pkg.model.FileDB;

public interface FileRespository  extends JpaRepository<FileDB, String>{
	
	

}
