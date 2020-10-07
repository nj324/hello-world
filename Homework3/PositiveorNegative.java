package Homework3;
import java.util.Scanner;


public class PositiveorNegative {

	public static void main(String[] args) {
		positiveOrNegative();	
		// TODO Auto-generated method stub

	}
	public static void positiveOrNegative() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive or negative number:");
		int num = input.nextInt();
		if(num>=0) {
			System.out.println("Your number is positive");
		}
		else{
			System.out.println("Your number is negative");
		}
		
		}
	}


