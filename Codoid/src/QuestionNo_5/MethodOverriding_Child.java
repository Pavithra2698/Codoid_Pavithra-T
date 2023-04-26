
//QUESTION NO:5

package QuestionNo_5;

public class MethodOverriding_Child extends MethodOverriding_Parent {

	@Override
	public void java(String a, String b) {
		super.java(a, b);
	}

	@Override
	public void program(int c, int d) {
		super.program(c, d);
	}

	public static void main(String[] args) {
		MethodOverriding_Child obj = new MethodOverriding_Child();
		obj.java("c", "sol");
		obj.program(1, 2);
	}
}
