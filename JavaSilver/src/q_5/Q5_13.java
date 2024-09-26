package q_5;
class Foo{
	int x;
	Foo(int a){
		x = a;
	}
	void setX(int a) {
		x = a;
	}
	int getX() {
		return x;
	}
}
public class Q5_13 {

	public static void main(String[] args) {
		Foo f1 = new Foo(500);
		System.out.println(f1.x);
		
		Q5_13 obj = new Q5_13();
		Foo f2 = obj.toObj(f1);
		System.out.println(f2.getX());
	}
	Foo toObj(Foo f1) {
		Foo f2 = new Foo(100);
		System.out.println(f1.getX());
		return f2;
	}
}

