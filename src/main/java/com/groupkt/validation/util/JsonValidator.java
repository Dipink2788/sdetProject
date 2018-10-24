package com.groupkt.validation.util;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonValidator {

	
	
	public void getStateDetails(String input, JSONArray jsonArray) {
	
		for(int i=0;i<jsonArray.length();i++)
		{
			JSONObject name = (JSONObject) jsonArray.get(i);
		if(name.getString("name").equalsIgnoreCase(input) || name.getString("abbr").equalsIgnoreCase(input))
		{
			if(name.has("largest_city") && name.has("capital"))
			{
			
				System.out.println("The largest_city and capital  for "+ input + " is : "+ name.getString("largest_city") + " and  "+ name.getString("capital"));
			}else if(name.has("largest_city"))
			{
				System.out.println("The capital is not available  and large city  for "+ input + " is : "+ name.getString("largest_city"));

			}else
			{
			System.out.println("The largest city is not available and capital  for "+ input + " is : "+name.getString("capital"));
			}
			break;
		}else if(jsonArray.length() == i+1)
		{
		System.out.println("The input is not valid");
		}
				
		}
	}

	
}
