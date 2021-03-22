package hello;

public class Define2 {

	public static void main(String[] args) {
		String[] classGroup = new String[4]; //클래스 그룹 정의(문자열, 수용량4)
		classGroup[0] = "ym";
		System.out.println(classGroup.length);
		classGroup[1] = "ch";
		System.out.println(classGroup.length);
		classGroup[2] = "is";
		System.out.println(classGroup.length);
		classGroup[3] = "sh";
		System.out.println(classGroup.length); //length는 길이가 아니라 몇개의 값을 저장할 수 있는지 알려줌
		System.out.println(classGroup);

	}

}
