
public class StuSample {

	public static void main(String[] args) {
		System.out.println("0000007008");
		
		Student stu1 = new Student();
		Student2 stu2 = new Student2();
		Student3 stu3 = new Student3("C", 78, 89);
		
		stu1.name = "A";
		stu1.setScore(99, 89);
		stu1.display();
		System.out.println("平均" + stu1.avgScore() + "点");
		
		stu2.setData("B", 60, 98);
		stu2.display();
		System.out.println("平均" + stu2.avgScore() + "点");
		
		stu3.display();
		System.out.println("平均" + stu3.avgScore() + "点");
	}

}
