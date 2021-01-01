package Assignment_14_OOP.question8;

public class ValueTest {

	public static void main(String[] args) {
		
		Value a=new Value();
		
		//a.setVal(5);
		
		
		Value b=new Value(4);
		
		System.out.println(a.wasModified());
		
		System.out.println(b.getVal());

	}

}
