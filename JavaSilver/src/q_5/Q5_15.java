package q_5;

public class Q5_15 {
	static int x = 1;
	int y = 1;
	public static void main(String[] args) {
		Q5_15 obj1 = new Q5_15();
		Q5_15 obj2 = new Q5_15();
		obj1.x = 5;
		obj1.y = 6;
		obj2.x = 7;
		obj2.y = 8;
		System.out.println("ans:" + obj1.x + obj1.y + obj2.x + obj2.y);
	}

}
