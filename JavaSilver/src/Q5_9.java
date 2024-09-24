
public class Q5_9 {
	static void methodA() {
		methodB();
		Q5_9.methodB();
		methodC();
		Q5_9.methodD();
	}

	static void methodB() {
	}

	void methodC() {
		methodB();
		Q5_9.methodB();
		methodD();
		Q5_9.methodD();
	}

	void methodD() {
	}
}
