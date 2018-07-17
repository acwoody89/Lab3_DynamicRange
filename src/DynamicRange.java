import java.util.Scanner;

public class DynamicRange {

	public static void main(String[] args) {
		int input1 = 0;

		Scanner scan = new Scanner(System.in);
		String userAns = "y";					// input number from user
		String userName = "";					// user name

		System.out.println("----------------------------------------------------------");
		System.out.println("Hello, what is your name?");
		userName = scan.next();
		System.out.println("Nice to meet you " + userName);

		do {
			System.out.println("----------------------------------------------------------");
			System.out.println(userName + ", Would you please enter a number between 1 and 100");

			input1 = scan.nextInt();
			
			// makes sure that the input is between 1 and 100
			if (input1 >= 1 && input1 <= 100) {
				evenRange(input1);
				oddRange(input1);
				
				System.out.println("----------------------------------------------------------");
				System.out.println("Would you like to continue " + userName + "? y/n");
				userAns = scan.next();

			} else {
				System.out.println("Invalid Number.");
			}
		} while (userAns.equals("y") || userAns.equals("Y"));

		System.out.println("Thanks for using this program " + userName + ".");
		System.out.println("----------------------------------------------------------");

	}

	/*
	 * evenRange takes in an int, then checks to see if it is even
	 * will also find what range the number is for the correct response
	 */
	public static void evenRange(int a) {
		int num = a;

		if (num % 2 == 0) {
			if ((num >= 2 && num <= 24)) {
				System.out.println("Even and less than 25");
			} else if (num >= 26 && num <= 60) {
				System.out.println("Even");
			} else {
				System.out.println("Even");
			}
		}
	}
	
	/*
	 * oddRange takes in an int, then checks to see if it is odd
	 * will also find what range the number is for the correct response
	 */
	public static void oddRange(int a) {
		int num = a;

		if (num % 2 != 0) {
			if (num > 60) {
				System.out.println("Odd and greater than 60");
			} else {
				System.out.println("Odd");
			}
		}
	}

}
