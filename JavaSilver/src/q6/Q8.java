package q6;

class MySuperClass {
	private int x;//プライベートなメンバ変数ｘ
	MySuperClass(int i) {//引数ありコンストラクタ
		x = i;
		System.out.println("mySuperClass: " + x);
	}
	//MySuperClass(){}
}

public class Q8 extends MySuperClass {
	public static void main(String[] args) {
		new Q8();
		new Q8(3);
	}/*Q8 obj = new Q8();と同じような
	ものだが、objという変数がないからあとから
	オブジェクトを使うことができない*/
	
	Q8(int i) {//引数ありコンストラクタ
		super(i);
	}
	Q8() {//引数なしデフォルトコンストラクタ
		//this(5);
		System.out.println("Default");
	}
}
