package Homework3;
import java.util.Scanner;
public class NameofWeekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		switch(num) {
		case 1 : System.out.println("Your day is Monday");
		break;
		case 2 : System.out.println("your day is Tuesday");
		break;
		case 3 : System.out.println("Your day is Wednesday");
		break;
		case 4 : System.out.println("Your day is Thursday");
		break;
		case 5 : System.out.println("Your day is Friday");
		break;
		case 6 : System.out.println("Your day is Saturday");
		break;
		case 7 : System.out.println("Your day is Sunday");
		break;
		default : System.out.println("Invalid number");
		}

	}

}
