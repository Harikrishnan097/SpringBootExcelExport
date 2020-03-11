package com.spring.websiteacty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class RegService {

	
	
	
	public List getall() throws ParseException
	{
		
		IncidentDesc fin = new IncidentDesc();
		
		IncidentDesc fin2 = new IncidentDesc();
		fin.setNo("123");
		fin.setTno("INC12345");
		fin.setRootcause("hdksahd");
		fin.setPcause("skjgfjdgjkf");
		fin.setCaction("jasdhfjkd");
		fin.setDateof(new SimpleDateFormat("dd/MM/yyyy").parse("04/02/1997"));
		fin2.setNo("123");
		fin2.setTno("INC12345");
		fin2.setRootcause("hdksahd");
		fin2.setPcause("skjgfjdgjkf");
		fin2.setCaction("jasdhfjkd");
		fin2.setDateof(new SimpleDateFormat("dd/MM/yyyy").parse("04/07/1997"));
		List f = new ArrayList<IncidentDesc>();
		f.add(fin);
		f.add(fin2);
		
		
		return f;
		
		
	}
}
