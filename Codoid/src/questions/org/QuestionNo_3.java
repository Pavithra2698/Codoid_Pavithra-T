package questions.org;

public class QuestionNo_3 {

	public static void main(String[] args) {
	    String str = "Hello World";
	    for(int i = 0; i < str.length(); i++) {
	      for(int j = i+1; j < str.length(); j++) {
	        if(str.charAt(i) == str.charAt(j)) {
	          System.out.println("Duplicate Character: " + str.charAt(i));
	        }}}

	}
}
