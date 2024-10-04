class Animal{
      void saySomething() {
		System.out.println("Gurrr");
	}
}

public class Q_16 extends Animal {
	protected void saySomething() {
		System.out.println("Mooo");
	}

	public static void main(String[] args) {
		Animal[] animals = {new Animal(),new Q_16()};
		for(Animal a : animals) {
			a.saySomething();
		}
	}

}
