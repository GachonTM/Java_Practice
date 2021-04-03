package static_ex;

public class StudentTest2 {
	
	public static void main(String[] args) {

		Student studentKim = new Student();
		System.out.println(studentKim.studentID); 

		
		Student studentLee = new Student();
		System.out.println(studentLee.studentID); 
		
		//serialNum이 각 인스턴스의 studentID에 저장됨
		
		System.out.println(studentKim.serialNum);
		System.out.println(studentLee.serialNum);
		
		//여전히 serialNum값은 공유됨
	}
}
