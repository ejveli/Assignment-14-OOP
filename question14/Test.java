package Assignment_14_OOP.question14;

public class Test {

	public static void main(String[] args) {
		
		OnSaleItem nike=new OnSaleItem("shirt", 5, 101, 25, 20);
		Item adidas=new Item("socks", 3, 202, 10);
		OnSaleItem apple=new OnSaleItem("iphone", 2, 303, 250, 10);
		Item LG=new Item("TV", 1, 404, 150);
		
		TJMaxx acer=new TJMaxx();
		
		TJMaxx.addRegularItem(nike);
		TJMaxx.addRegularItem(adidas);
		TJMaxx.addRegularItem(apple);
		TJMaxx.addRegularItem(LG);
		
		
		//TJMaxx.buyItem(404);
		//TJMaxx.buyItem(404);
		System.out.println(TJMaxx.getAllItemNames());
		
	}

}
