package hello;

public class If_statement9 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if((id.equals("youngmin") || id.equals("chanhyoung") || id.equals("sanghun"))
				&&password.equals("1234")) {
			System.out.println("Welcome");
		} else {
			System.out.println("Access_Denied");
		}
	}
}