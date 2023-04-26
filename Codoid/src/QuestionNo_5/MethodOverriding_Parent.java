
//QUESTION NO:5

package QuestionNo_5;

public class MethodOverriding_Parent {

	public void java(String a, String b) {
		System.out.println(a + " " + b);
	}

	public void program(int c, int d) {
		System.out.println(c + "," + d);
	}

	public static void main(String[] args) {
		MethodOverriding_Parent obj = new MethodOverriding_Parent();
		obj.java("Codoid", "Solutions");
		obj.program(5, 10);
	}
}
