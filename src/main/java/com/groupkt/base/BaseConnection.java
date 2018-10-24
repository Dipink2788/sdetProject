package com.groupkt.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.util.Scanner;

public class BaseConnection {

	public String baseUrlConnection() throws IOException {
		Properties prop = new Properties();
		File file = new File("config.properties");
		InputStream in = new FileInputStream(file);
		prop.load(in);
		String url = prop.getProperty("URL");
		System.out.println("The URL is" + url);
		URL apiURL = new URL(url);
		String responseVal = new String();

		try {

			HttpURLConnection connection = (HttpURLConnection) apiURL.openConnection();
			if (connection.getResponseCode() != 200) {
				throw new RuntimeException("The error code is : " + connection.getResponseCode());
			}

		} catch (Exception e) {
			System.out.println("The URL confugration Exception is" + e.getMessage());
		}

		Scanner scan = new Scanner(apiURL.openStream());

		while (scan.hasNext()) {
			responseVal += scan.nextLine();

		}
		scan.close();
		return responseVal;
	}
}
