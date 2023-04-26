
//QUESTION NO:66

package questions.org;

import java.util.Scanner;

public class QuestionNo_66 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter table to multiple");
		int a = sc.nextInt();

		System.out.println("Till which number to multiple");
		int b = sc.nextInt();

		int c;

		for (int i = 0; i <= b; i++) {
			c = a * i;
			System.out.println(a + "*" + i + "=" + c);

		}
	}
}
