package q6;
class Parent{
	int num = 100;
	void show() {
		System.out.println(num);
	}
}
class Child extends Parent{
	int num = 400;
	/*void show() {
		System.out.println(num);
	}*/
}

public class Q3 {

	public static void main(String[] args) {
		Child c = new Child();
		c.show();
	}

}
