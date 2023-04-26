
//Question:8

package QuestionNo_8;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1, 2));    
        System.out.println(calc.add(1, 2, 3)); 
    }

	
}
