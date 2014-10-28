public class testSucc2 {

	public static void main(String[] args) {

		A a1 = new A(10);
		A a2 = new A(20);

		if (a1.getNumber() > a2.getNumber()) {
			System.out.println("a1 = " + a1.getNumber());
		} else {
			System.out.println("a2 = " + a2.getNumber());
		}

		public class A {
			private int number;

			public A(int number) {
				this.number = number;

			}

			public void printNumber() {
				System.out.println(number);
			}

			public int getNumber() {
				return number;
			}
		}

		public class B {

			private String name;

			public B(String name) {
				this.name = name;
			}

			public String getName() {
				return name;
			}
		}

	}

}
