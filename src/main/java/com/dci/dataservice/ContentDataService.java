package com.dci.dataservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dci.bean.Content;

@Service
public class ContentDataService {
	
	static List<Content> contents = Arrays.asList(
			new Content(11, "Europe", "Map"),
			new Content(22, "Asia", "Map"),
			new Content(33, "Northern Americ", "Map"),
			new Content(44, "Germany", "Map"));
	
	
	public List<Content> getContents() {
		return contents;
	}	
}

