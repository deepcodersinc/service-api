package com.dci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dci.bean.Content;
import com.dci.dataservice.ContentDataService;

@RestController
@RequestMapping("/api")
public class RestAPIController {
 
	@Autowired 
	ContentDataService service;

	@GetMapping(value = "/contents")
	public List<Content> getContents() {
		return service.getContents();
	}	
}
