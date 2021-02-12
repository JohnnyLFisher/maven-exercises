import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.*;

public class FirstExercise {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a sentence:");
		String str = input.nextLine();
		System.out.println("You entered: " + str);
		if (isNumeric(str)){
			System.out.println("\"" + str + "\"" + " is a number.");
		} else {
			System.out.println("\"" + str + "\"" + " is not a number.");
			System.out.println("Flipped Case: " + swapCase(str));
		}
		System.out.println("Reversed: " + reverse(str));
	}
}
