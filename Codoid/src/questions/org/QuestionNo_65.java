
//QUESTION NO:65

package questions.org;

import java.util.Scanner;

public class QuestionNo_65 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your number:");
			int n = sc.nextInt();
			if (n % 2 == 0) {
				System.out.println("The number is even");
			} else {
				System.out.println("The number is odd");
			}
		}
	}
}
