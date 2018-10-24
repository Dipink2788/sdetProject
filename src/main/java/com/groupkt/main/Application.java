package com.groupkt.main;

import java.io.IOException;

import com.groupkt.service.Service;

public class Application {
	
	public static void main(String args[]) throws IOException
	{
		Service service = new Service();
		service.runApplication();
	}

}
