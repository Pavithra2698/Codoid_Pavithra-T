
//QUESTION NO:29

package QuestionNo_29;

public class Multiple_C implements Multiple_A, Multiple_B {

	@Override
	public void bike() {
		System.out.println("FZ");

	}

	@Override
	public void car() {
		System.out.println("PORSCHE");

	}

	public static void main(String[] args) {
		Multiple_C obj = new Multiple_C();
		obj.bike();
		obj.car();
	}
}
