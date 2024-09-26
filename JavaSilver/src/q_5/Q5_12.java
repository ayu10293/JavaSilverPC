package q_5;
class Foo1 {
	int x;
	void setX(int x) {
		this.x = x;
	}
	int getX() {
		return x;
	}
}
class Foo2{
	Foo1 f;
	void setFoo1(Foo1 f) {
		this.f = f;
	}
	Foo1 getFoo1() {
		return f;
	}
}
public class Q5_12 {

	public static void main(String[] args) {
		Foo1 f1 = new Foo1();
		Foo2 f2 = new Foo2();
		int a = 10;
		f1.setX(a);
		f2.setFoo1(f1);
		//f1（Foo1クラスのオブジェクト）をf2のメンバー変数f（Foo1型）にセットしています。つまり、f2の中にf1が保存された状態になります。
		f2.getFoo1().setX(100);
		//f2の中に保存されているFoo1オブジェクト（つまり、f1）のxに対してsetX(100)を呼び出しています。元々f1のxには10がセットされていましたが、この行で100に置き換わります。
		f1.setX(100);
		System.out.println(f2.getFoo1().getX());
		//f1のxは最初に10に設定され、f2を通して再びsetX(100)を呼び出して、xの値が100に更新されています。
	}

}
