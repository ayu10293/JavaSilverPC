
public class Q5_3 {
	int x = 3;
	static int y = 2;
	
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		Q5_3 obj = new Q5_3();
		obj.printIt();
		obj.printIt(y);
	}
	Q5_3(){
		x = x + 1;
	}
	static {
		y += y;
	}
	void printIt() {
		System.out.print(++x);
	}
	void printIt(int y) {
		System.out.print(" " + ++y);
	}

}
