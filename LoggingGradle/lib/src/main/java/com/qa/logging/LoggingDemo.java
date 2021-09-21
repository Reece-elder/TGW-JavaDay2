package com.qa.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
	
	// Create a logger object for use called newLogger
	// Created with the Logmanager class and the .getLogger method
	public static Logger newLogger = LogManager.getLogger();
	
	// Logging is the process of writing messages during the execution of an app so the user can VISUALLY see whats going on
	// Generally used for reporting, debugging and any info messages which can be analysed pose execution
	
	// Java already contains its own logger java.util.logging.logger
	
	// We use third party / external loggers because they are more focused and offer additional features
	
	// Log4J
	// - Includes pre defined log levels based on severity (debug, info, fatal)
	// - Output log messages to other destinations; files, databases etc
	// - Runs by interface, meaning new methods can be added
	// - Each logger is a unique object, meaning multiple loggers can be used (depending on severity)
	
	public static void loggingExample() {
		System.out.println("This is running with the default logger!");
		newLogger.fatal("This is fatal");
		newLogger.warn("This is the warn level");
		newLogger.info("This is the info level");
		
	}
	
	
	public static void log4jExample() {
		
		// Name of logger . logger level ("Value of the logger")
		newLogger.warn("This is the info level");
		
	}

}
