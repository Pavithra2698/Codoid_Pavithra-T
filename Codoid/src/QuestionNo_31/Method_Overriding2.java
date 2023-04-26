//QuestionNo:31

package QuestionNo_31;

public class Method_Overriding2 extends Method_Overriding {

	@Override
	public void Animals() {
		System.out.println("dog barks");
	}
	
	public static void main(String[] args) {
		Method_Overriding2 obj=new Method_Overriding2();
		obj.Animals();
	}
}
