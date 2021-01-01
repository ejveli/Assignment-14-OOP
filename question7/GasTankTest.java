package Assignment_14_OOP.question7;

public class GasTankTest {

	public static void main(String[] args) {
		
		GasTank tank=new GasTank(21.5);
		
		tank.addGas(22.5);
		System.out.println(tank.amount);
		System.out.println(tank.isFull());
		
		tank.useGas(23);
		System.out.println(tank.amount);
		
		System.out.println(tank.isEmpty());
		System.out.println(tank.getGasLevel());
		System.out.println(tank.fillUp());

	}

}
