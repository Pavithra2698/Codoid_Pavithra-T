
//QUESTION NO:41

package questions.org;

import java.util.Scanner;

public class QuestionNo_41 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your First number:");
			int a = sc.nextInt();
			System.out.println("first number is" + a);

			System.out.println("Enter your Second number:");
			int b = sc.nextInt();
			System.out.println("first number is" + b);

			a = a + b;
			b = a - b;
			a = a - b;

			System.out.println("after swapping");
			System.out.println(a);
			System.out.println(b);
		}
	}
}
