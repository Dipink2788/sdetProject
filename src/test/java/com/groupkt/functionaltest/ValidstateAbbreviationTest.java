package com.groupkt.functionaltest;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.groupkt.base.BaseConnection;
import com.groupkt.convertor.JsonConvertor;

public class ValidstateAbbreviationTest {
	
	
	@Test(dataProvider = "data")
	public void validation(String data) throws IOException
	{
		
		
	     String entireResponse = new String();

		//Establish connection
		BaseConnection basecon = new BaseConnection();
		entireResponse = basecon.baseUrlConnection();

		
		//Conversion and validation
		JsonConvertor jconver = new JsonConvertor();
		jconver.convertorwithdata(entireResponse, data);
	}
	
	@DataProvider(name = "data")
	public String[] dataInput()
	{
		return new String[] {"WV","WI","al","sd","or"};
		
	}
	

}
