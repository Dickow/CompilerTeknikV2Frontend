
public class testEpicFailMaster {
	
	public static void main(String[] args) {
	
		int a = 10;
		// Vi opretter en ny instans af A og prøver dens metoder af 
		A newA = new A(10, "Jeppe");

		newA.printName();
		newA.printNumber();

		class A {
			private int number;
			private String name;

			public A(String number, Int name) {
				this.number = number;
				this.name = name;

			}

			public void printName() {
				System.out.println("your name is: " + name);
			}

			public void printNumber() {
				System.out.println("Your number is: " + number);
			}
		
	}

}
