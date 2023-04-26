
//QUESTION NO:59

package QuestionNo_59;

public class Abstraction_Child implements Abstraction_Parent {

	@Override
	public void car() {
		System.out.println("audi");
	}

	@Override
	public void bike() {
		System.out.println("bmw");
	}

	@Override
	public void cycle() {
		System.out.println("ladybird");
	}

	public static void main(String[] args) {
		Abstraction_Parent obj = new Abstraction_Child();
		obj.car();
		obj.bike();
		obj.cycle();

	}
}
