package Assignment_14_OOP.question1;

public class Atts {
	/*The class Atts holds a few attributes and has a method called asString.
	 *  The attributes are name and color -both are strings and amount which is an int.
	 *  Their visibility is public. asString returns a string showing all the Atts in a format.

for example:

Atts a = new Atts();
a.name = "table";
a.color = "brown";
a.amount = 1;

System.out.println(a.asString());

name: table color: brown amount: 1

Create the required attributes and method inside the atts class 
	 */

	public String name;
	public String color;
	public int amount;

	public String asString() {

		return "name:" + name + " color:" + color + " amount:" + amount;
	}

}
