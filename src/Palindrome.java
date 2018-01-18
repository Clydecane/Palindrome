import java.util.Scanner;

public class Palindrome {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		int number = keyboard.nextInt();
		int truenumber = number;
		int reverse = 0;
			while (number != 0) {
				reverse = reverse * 10;
				reverse = reverse + number%10;
				number = number/10;
			}
			if (reverse == truenumber) {
				System.out.println(truenumber + " is a palindrome.");
			}
			else System.out.println(truenumber + " is not a palindrome.");
	}
}
	