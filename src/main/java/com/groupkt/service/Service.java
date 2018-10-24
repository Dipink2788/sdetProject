package com.groupkt.service;

import java.io.IOException;

import com.groupkt.base.BaseConnection;
import com.groupkt.convertor.JsonConvertor;

public class Service {
	
	public void runApplication() throws IOException {
		String entireResponse = new String();
		
		//Establish connection
		BaseConnection basecon = new BaseConnection();
		entireResponse = basecon.baseUrlConnection();

		
		//Conversion and validation
		JsonConvertor jconverter = new JsonConvertor();
		jconverter.convertorwithuser(entireResponse);
	}

}
