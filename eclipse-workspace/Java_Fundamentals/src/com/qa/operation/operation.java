package com.qa.operation;

public class operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary;
		salary = 40000;
		float productPrice;
		productPrice = 200.5f;
        salary = salary + (salary * 10 / 100);
        System.out.println(salary);
        
        float discount;
        discount = (productPrice * 5 / 100);
        System.out.println("discount is" + discount); 
        
        float finalPrice;
        finalPrice = productPrice - discount;
        System.out.println("final price is" + finalPrice);
        byte num1;
        num1 = 10;
        System.out.println(++num1);
        
        byte num2;
        num2 = 20;
        System.out.println(--num2);
        
        /* relational operators
         * >
         * >=
         * <
         * <-
         * ==
         * !=
         */
        	
        System.out.println(salary >= 50000);
        System.out.println(salary <= 50000);
        System.out.println(salary > 50000);
        System.out.println(salary >= 50000);
        System.out.println(salary == 50000);
        System.out.println(salary != 50000);
        /*
         * logical operators
         * && and
         * || or
         * ^  XOR
         */
        
	}

}
