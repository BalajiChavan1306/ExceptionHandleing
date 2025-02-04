package Masai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class divisibleBy100 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
			System.out.println("Enter the number");
			int userInput=sc.nextInt();
			int result=100/userInput;
			System.out.println(result);
		}catch(ArithmeticException e)
		{
			System.out.println("Error Division by zero is not allowed");
		}catch(InputMismatchException e)
		{
			System.out.println("Error:Input is inavlid");	
		}catch(Exception e)
		{
			System.out.println("An unexcepted error "+ e.getMessage());
		}

	}

}
