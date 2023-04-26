
//QUESTION NO:7

package questions.org;

public class QuestionNo_7 {

	private void Program(int a, int b) {
		System.out.println(a + b);
	}

	private void Program(int c, String d) {
		System.out.println(c + "," + d);

	}

	private void Program(String e, String f) {
		System.out.println(e + "," + f);
	}

	public static void main(String[] args) {
		QuestionNo_7 obj = new QuestionNo_7();
		obj.Program(10, 20);
		obj.Program(5, "Java");
		obj.Program("JAVA", "LANGUAGE");
	}

}
