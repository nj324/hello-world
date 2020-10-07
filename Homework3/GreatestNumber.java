package Homework3;
import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = input.nextInt();
		System.out.println("Enter a number:");
		int y = input.nextInt();
		System.out.println("Enter a number:");
		int z = input.nextInt();
		int result=maxNumber(x,y,z);
		System.out.print(result);

	}
	public static int maxNumber(int a, int b, int c) {
		int max=0;
		if(a>b&a>c) {
			max=a;
		}
		else if(b>a&b>c) {
			max=b;
		}
		else {
			max=c;
		}
		return max;
				
	}

}
