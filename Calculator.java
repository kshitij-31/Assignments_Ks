package Assignmnet;
import java.util.*;
import java.util.Scanner;

public class Calculator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double a,b,c,option;
		System.out.println("Enter any two digits :");
		a=scan.nextDouble();
		b=scan.nextDouble();
		
		System.out.println("Choose your option :");
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		
		option=scan.nextDouble();
		while (option>4) {
			System.out.println("Please enter a valid selection");
			option=scan.nextDouble();
		}
		
		Calculator1 num=new Calculator1();
		
		if(option==1) {
			c=num.add(a,b);
			System.out.println("Answer is " +c);
		}
		else if(option==2) {
			c=num.sub(a, b);
			System.out.println("Answer is " +c);
		
		}
		else if(option==3) {
			c=num.mult(a, b);
			System.out.println("Answer is " +c);
		
		}
		else if(option==4) {
			c=num.div(a, b);
			System.out.println("Answer is " +c);
		
		}
		else {
			System.out.println("Invalid input");
		}
	}


   
}