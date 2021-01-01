package Assignment_14_OOP.question8;
/*Write a class definition of a class named 'Value' with the following:
a constructor accepting a single integer parameter
a constructor with no parameters
a method 'setVal' that accepts a single parameter,
a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
a method 'getVal' that returns an integer value as follows: if setVal has ever been called,
it getVal returns the last value passed to setVal.
Otherwise if the "single int parameter" constructor was used to create the object,
getVal returns the value passed to that constructor. Otherwise getVal returns 0.
 */

public class Value {

	private int a=0;

	public Value(int a) {

		this.a = a;
	}

	public Value() {

	}

	public int getVal() {
		return a;
	}

	public void setVal(int a) {
		this.a = a;
	}
	
	public boolean wasModified() {
		
		if(a!=0) return true;
		else return false;	
		
	}
	
	
	
}
