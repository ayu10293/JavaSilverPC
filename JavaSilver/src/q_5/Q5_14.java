package q_5;

public class Q5_14 {
	int val;
	static void x(int val) {
		val = 9;
		System.out.println(val + " ");
	}
	public static void main(String[] args) {
		Q5_14 obj = new Q5_14();
		obj.val = 8;
		int val = 10;
		System.out.println(val + " ");
		x(val);
		System.out.println(val + " ");
		System.out.println(obj.val + " ");
	}

}
