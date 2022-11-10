package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		Student studentCho = new Student();
		studentCho.studentName="조성훈";
		studentCho.studentID=1056;
		studentCho.address="서울특별시";
		
		System.out.println(studentCho.studentName);
		System.out.println(studentCho.getStudentName());
		System.out.println(studentCho.studentID);
		System.out.println(studentCho.address);
	}
}

