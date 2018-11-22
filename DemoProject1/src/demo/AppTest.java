package demo;

public class AppTest {

	public static void main(String[] args) {
		SalesData sdata = new SalesData();
		
		displayGreeting();
		sdata.display();
		
		
	}
	private static void displayGreeting() {
		System.out.println("Hello!, Happy Sales People");
		System.out.println("This App shows sales data");
		
		System.out.println("Test");
		
	}

}
