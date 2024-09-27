package q6;
interface A{}
class B implements A{}
class C extends B {}
class D {}

public class Q5 {
	public static void main(String[] args) {
		A obj1 = new B();//A型の変数obj1を宣言し、Bクラスのインスタンスを作成して、obj1に代入
		B obj2 = new C();//B型の変数obj1を宣言し、Cクラスのインスタンスを作成して、obj1に代入
		D obj3 = new D();//D型の変数obj1を宣言し、Dクラスのインスタンスを作成して、obj1に代入
		if(obj1 instanceof A) {System.out.println("obj1 ");}
		if(obj2 instanceof A) {System.out.println("obj2 ");}
		if(obj3 instanceof A) {System.out.println("obj3 ");}
     }
}
/*instanceof 演算子は、あるオブジェクトが特定のクラスまたはインターフェースのインスタンスで
あるかどうかを確認するために使われます。*/