package com.groupkt.convertor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONObject;

import com.groupkt.validation.util.JsonValidator;

public class JsonConvertor {
	
	JsonValidator jsonval = new JsonValidator();

	
	public void convertorwithuser(String Response) throws IOException
	{
		boolean val = true;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null; 
		
		JSONObject responseJson = new JSONObject(Response);
		if(responseJson != null)
		{
		JSONObject restResponse = responseJson.getJSONObject("RestResponse");
		JSONArray jsonArray = 	restResponse.getJSONArray("result");
		if(jsonArray != null) {
			
			while(val)
			{
				System.out.println("Please eneter the state name or abbreviation ");
				input = br.readLine();

				 jsonval.getStateDetails(input, jsonArray);
			
			System.out.println("Do you like to continue ? yes/no");

			val  = br.readLine().equalsIgnoreCase("yes") ? true : false; 
			}
	
		}
				
		
		
		
		}
	}


	public void convertorwithdata(String Response,String data) throws IOException
	{
		//jsonvalidator jsonval = new jsonvalidator();
		
		JSONObject responseJson = new JSONObject(Response);
		if(responseJson != null)
		{
		JSONObject restResponse = responseJson.getJSONObject("RestResponse");
		JSONArray jsonArray = 	restResponse.getJSONArray("result");
		if(jsonArray != null) {
			
			
				
				jsonval.getStateDetails(data, jsonArray);
			

			
		}
				
		
		
		
		}
	}



	

}
