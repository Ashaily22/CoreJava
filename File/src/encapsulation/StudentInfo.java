package encapsulation;

public class StudentInfo {

	public static void main(String[] args) {
		Student st1=new Student();
		st1.setStdId(001);
		st1.setname("Shailly");
		
		System.out.println(st1.getStdId());
		System.out.println(st1.getname());
	}

}
