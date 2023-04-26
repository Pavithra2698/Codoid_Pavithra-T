
//QUESTION NO:36

package questions.org;

public class QuestionNo_36 {

	public static void main(String[] args) {

		int a = 0, b = 1, c;
		System.out.println("Fibonacci series");
		System.out.print(a + ",");
		System.out.print(b + ",");
		for (int i = 0; i <= 10; i++) {
			c = a + b;
			System.out.print(c + ",");
			a = b;
			b = c;
		}

	}
}
