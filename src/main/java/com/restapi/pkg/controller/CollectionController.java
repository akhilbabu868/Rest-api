package com.restapi.pkg.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
@RestController
public class CollectionController {

	
	@RequestMapping(value="/arrayList")
	public void ArrayList() {

		 List<String> animals = new ArrayList<>();
		 animals.add("Dog");
		 animals.add("Cat");
		 animals.add("Camel");
		 
		 Iterator itr=animals.iterator();  
		 
		 while(itr.hasNext()){  
			 
			 System.out.println("ArrayList__________"+itr.next());
		
		 }  
	}
//	
//	
//	
//	@RequestMapping(value="/linkedList")
//	public void LinkedList() {
//
//		 List<Integer> rollno = new LinkedList<>();
//		 rollno.add(01);
//		 rollno.add(02);
//		 rollno.add(02);
//		 rollno.add(02);
//		 
//	//	 Iterator<E>
//	}
	
	
//	
	@RequestMapping(value = "/Map")
	public void Map() {

		Map map = new HashMap();
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");

		Set set = map.entrySet();// Converting to Set so that we can traverse
		Iterator itr = set.iterator();
		
		while (itr.hasNext()) {
			// Converting to Map.Entry so that we can get key and value separately
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	
	
	
}
