package com.project.variables;

public class StaticVariablesDemo {
	static int a=30;
	static int b=60;
	static int sum= a+b;
	
public void demo() {
	System.out.println("Demo method from the class");
	
	}

public static void main(String[] args) {
	System.out.println(StaticVariablesDemo.sum);
}
} 