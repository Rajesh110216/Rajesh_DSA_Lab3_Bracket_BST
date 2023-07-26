package com.gl.bracket;

// Write a program of Balancing Brackets, use a suitable data structure to print whether the string entered is a Balanced Brackets 
// or Unbalanced String ****** Sample input are  ([[{}]]) and ([[{}]]))

public class DriverApp {
public static void main(String[] args) {
	String input="([[{}]]))";
	MyStack ms=new MyStack();
	Boolean result=ms.checkBracket(input);
	if(result==true)
		System.out.println("The entered "+input+" has balanced brackets.");
	else
		System.out.println("The entered "+input+" has not balanced brackets.");
	
}
}
