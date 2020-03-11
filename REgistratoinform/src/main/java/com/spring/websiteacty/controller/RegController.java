package com.spring.websiteacty.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.jxls.template.SimpleExporter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.websiteacty.RegService;
import com.spring.websiteacty.IncidentDesc;

@RestController
public class RegController {

	
	RegService reg = new RegService();
	
	@RequestMapping("/")
	public ModelAndView page()
	{
		
		return new ModelAndView("index");
	}
	
	
	
	@RequestMapping(value = "/export", method = RequestMethod.GET)
	public void export(HttpServletResponse response) throws ParseException {
		List<IncidentDesc> persons = reg.getall();
		List<String> headers = Arrays.asList("NO", "TNO","ROOTCAUSE","PCAUSE","CACTION","DATE");
		
		try {
			response.addHeader("Content-disposition", "attachment; filename=Export.xls");
			response.setContentType("application/vnd.ms-excel");
			new SimpleExporter().gridExport(headers, persons, "no,tno,rootcause,pcause,caction,dateof", response.getOutputStream());
			
			
			  
			response.flushBuffer();
		} catch (IOException e) {
		System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
}
