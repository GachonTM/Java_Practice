package hello;

public class If_statement5 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if(id.equals("youngmin")) {
			if (password.equals("1234")) {
				System.out.println("Welcome");
			} else {
				System.out.println("Access_Denied");
			}
		} else {
			System.out.println("Access_Denied");
		}
	}
}
