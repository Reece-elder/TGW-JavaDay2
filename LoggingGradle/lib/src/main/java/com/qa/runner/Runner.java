package com.qa.runner;

import com.qa.logging.LoggingDemo;

public class Runner {
	
	public static void main(String[] args) {
		LoggingDemo.loggingExample();
		LoggingDemo.log4jExample();
	}
	
	// Exercise
	// - Create a new logger (log4j)
	// - Create 3 different methods each returning a different data type (int, String, boolean)
	// - Create a new method logging out the returns of those methods at all different log levels 
	// - Add the configuration file to only show logs of Warn and upwards

}
