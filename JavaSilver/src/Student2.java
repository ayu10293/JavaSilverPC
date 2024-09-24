//オーバーロード
public class Student2 {
	String name;
	int mathScore;
	int engScore;
	
	void setData(String n) {
		name = n;
	}
	void setData(String n, int m, int e) {
		name = n;
		mathScore = m;
		engScore = e;
	}
	void setScore(int m, int e) {
		mathScore = m;
		engScore = e;
	}
	/*void display() {
		System.out.println(name + "さん");
		System.out.println("数学" + mathScore + "点" + " " + "英語" + engScore + "点");
	}*/
	double avgScore() {
		double avg = (mathScore + engScore) / 2.0;
		return avg;
	}
}
