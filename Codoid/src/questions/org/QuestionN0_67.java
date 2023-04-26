
//QUESTION NO:67

package questions.org;

import java.util.Scanner;

public class QuestionN0_67 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter Your Number:");
			int n = s.nextInt();

			int arm = 0, rem = 0, i = n;

			while (n > 0) {
				rem = n % 10;
				arm = arm + (rem * rem * rem);
				n = n / 10;
			}

			if (arm == i) {
				System.out.println("Armstrong number");
			} else {
				System.out.println("Not an armstrong number");
			}
		}

	}

}
