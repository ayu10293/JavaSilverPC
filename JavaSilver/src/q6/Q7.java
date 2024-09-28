package q6;
class AA{
	AA(String message){
		System.out.println(message + " from AA. ");
	}//引数付きのコンストラクタ
}
class BB extends AA{
	BB(){
		//super("Hello");
		System.out.println("Hello from BB.");
	}//引数なしのコンストラクタ
}
public class Q7 {

	public static void main(String[] args) {
		BB b = new BB();
	}
}
/*サブクラスをインスタンス化すると
スーパークラスのコンストラクタが呼び出される*/

/*サブクラスのBBをインスタンス化する。
 * 8行目（サブクラス）のコンストラクタが呼ばれる前に
 * スーパークラスのAAのデフォルトコンストラクタ（引数なし）が呼ばれる
 * が、３行目は引数付きのコンストラクタのため、
 * 呼び出した８行目でエラーになる
 * 解決法は８行目のコンストラクタの先頭ににsuper(引数)を入れる（11行目）
 */