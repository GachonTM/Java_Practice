package static_ex;

public class StudentTest1 {
	
	public static void main(String[] args) {

		Student studentKim = new Student();
		System.out.println(studentKim.serialNum); 
		studentKim.serialNum ++;
		
		Student studentLee = new Student();
		System.out.println(studentLee.serialNum); 
		System.out.println(studentKim.serialNum); //�ø���ѹ�(static����)�� ��ü������ ������
	}
}
