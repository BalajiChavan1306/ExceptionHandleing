package Masai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class validAge extends Exception{
	public  validAge(String message)
	{
		super(message);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter your age");
			int age=sc.nextInt();
			if(age<0 || age>150)
			{
				throw new validAge("Inavlis age! Ahe should be between 0 and 150");
				
			}
			System.out.println("Your age is valid "+age);
		
		}
		catch(validAge e)
		{
			System.out.println("Error "+e.getMessage());
		}
		 catch (InputMismatchException e) {
	            System.out.println("Error: Please enter a valid integer for age.");
	        } catch (Exception e) {
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        } finally {
	            sc.close();
	            System.out.println("Program execution completed.");
	        }
	    }
		
		
	}


