package Stack;

public class Test {

	public static void main(String[]args) {
		
		StackArrayBased s1=new StackArrayBased();
		
		s1.push(4);
		
		System.out.println(s1.top());
	
		s1.outputStack();
		s1.push(61);
		s1.outputStack();
		
	}
}
