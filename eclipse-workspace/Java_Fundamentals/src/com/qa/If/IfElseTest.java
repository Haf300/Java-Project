package com.qa.If;

public class IfElseTest {

	public static void main(String[] args) {
	int num1;
	num1 = 61;
	if (num1%2==0) {
		System.out.println(num1 +"is even");
	
	}else {
		System.out.println(num1 + "is odd");
	}
	/*
	 * decide increment percentage based on experience
	 * if experience is better than 2 years and department is development then increment 10%
	 * if experience is better than 5 years and department is sales then increment 8%
	 * else increment 5%
	 * 
	 */
	  
	float salary;
	salary = 120000.5f;
	byte experience;
	experience = 4;
	char department;
	department = 'D';
	byte incrementPercentage;
	if(experience > 2 && department == 'D') {
	   incrementPercentage = 10;
	   System.out.println("2");
	}else if (experience > 5 && department == 'S') {
        incrementPercentage = 8; 
    }else 
    	incrementPercentage = 5;
        System.out.println("3");{    
    
    } 
	salary = salary +(salary * incrementPercentage / 100);
	System.out.println(salary);
	}   
	
}	
	