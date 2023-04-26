package questions.org;

public class QuestionNo_25 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			if (i == 5) {
				i++;
				continue;
			}
			if (i == 8) {
				break;
			}
			System.out.print(i + " ");
			i++;
		}
		System.out.println("Done.");
	}
}
