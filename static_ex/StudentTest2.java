package static_ex;

public class StudentTest2 {
	
	public static void main(String[] args) {

		Student studentKim = new Student();
		System.out.println(studentKim.studentID); 

		
		Student studentLee = new Student();
		System.out.println(studentLee.studentID); 
		
		//serialNum�� �� �ν��Ͻ��� studentID�� �����
		
		System.out.println(studentKim.serialNum);
		System.out.println(studentLee.serialNum);
		
		//������ serialNum���� ������
	}
}
