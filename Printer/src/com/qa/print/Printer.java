package com.qa.print;

import com.qa.hello.HelloWorld;
//import com.qa.priavte.PrivateHello;

public class Printer {
	
	public static void main(String[] args) {
		// Will be system outting the HelloWorld method
		System.out.println(HelloWorld.returnHelloWorld());
//		System.out.println(PrivateHello.privateHello());
	}

}

// Exercise 

// Create a calculator module with following methods add, subtract. Each method takes in two ints
// and returns the result

// A printing module with one method that returns a string that follows this guideline
// "5 + 7 = " + result using the values from the calculator module

// A main module that prints out the final sum based on two integers and method passed

// Modules structure: 
// main > calculator > printing


