package static_ex;

public class Student {
	
	static int serialNum = 100; //static���� = �ش����� ������ �����Ǵ� ����
	
	// static���� = class����, ������� = �ν��Ͻ� ���� 
	// static �տ� private�� �����ϸ� �ܺο��� ������ �� �� ����
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

}
