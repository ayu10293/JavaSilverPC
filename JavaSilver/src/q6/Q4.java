package q6;
interface A{
	void x (int num);//インターフェース内抽象メソッド
}
abstract class B{
	public void x(int num) {}
	public abstract void y();//抽象クラス内抽象メソッド
}

public class Q4 extends B implements A{
	public void y() {}
}
/*インターフェースと抽象クラスのどちらかで宣言された
メソッドが、具体的な実装を継承クラス内で既に持って
いる場合、その継承クラスで再度実装する必要はない。
Q4 では A のメソッド x(int num) は B で実装済み
のため、Q4 は y() だけを実装すれば問題ない。*/