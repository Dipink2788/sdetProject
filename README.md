# sdetProject
This project is releated to hitting "http://services.groupkt.com/state/get/USA/all" and do action on the response based on user input and datas.

#Prerequisites
Java1.8,TestNG,Maven

#Program

The program for user input is writtern in the src/main/java
It has com.groupkt.base,com.groupkt.convertor,com.groupkt.main,com.groupkt.service,com.groupkt.validation.util
com.groupkt.main - Application.java - main class
com.groupkt.base -  BaseConnection.java -  To hit the URL and get the response to string.
com.groupkt.convertor - JsonConvertor.java - To conver the response in to Json object
com.groupkt.service - Service.java  - program to run the application for user 
com.groupkt.validation.util - JsonValidator.java  - To validate the input and get the response

#Test Script

The test script is controlled by Testng.xml suit.
It access the classes in the folder src/test/java/com.groupkt.functionaltest
The data inputs for each of the class is provided by Dataprovider

#config.properties
The url is accessed from here and can be modified here.
