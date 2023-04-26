
//QUESTION NO:52

package questions.org;

public class QuestionNo_52 {
	public static void main(String[] args) {

		String s = "level";
		int n = s.length();
		String r = " ";

		for (int i = n - 1; i >= 0; i--) {

			r = r + s.charAt(i);

		}
		System.out.println(r);
		if (s.equals(r)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}
}
