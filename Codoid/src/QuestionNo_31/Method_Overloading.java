//QuestionNo:31

// method overloading
package QuestionNo_31;

public class Method_Overloading {
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		int result1 = sum(50, 50);
		int result2 = sum(10, 20, 30);
		System.out.println("result is" + result1);
		System.out.println("result is" + result2);
	}
}
