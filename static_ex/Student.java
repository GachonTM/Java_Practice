package static_ex;

public class Student {
	
	static int serialNum = 100; //static변수 = 해당파일 내에서 공유되는 변수
	
	// static변수 = class변수, 멤버변수 = 인스턴스 변수 
	// static 앞에 private을 선언하면 외부에서 가져다 쓸 수 없음
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

}
