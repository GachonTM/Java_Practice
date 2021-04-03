package hello;

public class StudentInfo {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + ","+address);
	}
	
	public static void main(String[] args) {
		
	StudentInfo studentLee = new StudentInfo();
	studentLee.studentName = "±è¿µ¹Î";
	studentLee.address = "¼­¿ï";
	
	studentLee.showStudentInfo();
	}
}