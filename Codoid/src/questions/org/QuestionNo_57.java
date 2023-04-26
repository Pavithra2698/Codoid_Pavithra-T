
//QUESTION NO:57

package questions.org;

public class QuestionNo_57 {

	public static void main(String[] args) {

		String a = "JAVA";
		String[] split = a.split("");

		for (String string : split) {
			System.out.println(string);
		}

		String[] split2 = a.split(" ");
		for (String string : split2) {
			System.out.println(string);
		}

	}
}