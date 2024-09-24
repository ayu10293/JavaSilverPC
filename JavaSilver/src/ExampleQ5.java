public class ExampleQ5 {
    static int count = 0; // static変数

    public ExampleQ5() {
        count++; // コンストラクタでstatic変数を増加
    }

    public static int getCount() { // staticメソッド
        return count; // static変数の値を返す
    }
}