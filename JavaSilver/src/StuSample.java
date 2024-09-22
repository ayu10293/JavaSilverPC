
public class StuSample {

	public static void main(String[] args) {
		System.out.println("0000007008");
		
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		stu1.name = "A";
		stu1.setScore(99, 89);
		stu1.display();
		System.out.println("平均" + stu1.avgScore() + "点");
	}

}
