package ex;

public class RegexValidatePin {

	public static void main(String[] args) {
		System.out.println(validatePin("334567"));
		System.out.println(validatePin("0000"));
		System.out.println(validatePin("347a"));

	}

	public static boolean validatePin(String pin) {
		
		return pin.matches("\\d{4}") || pin.matches("\\d{6}");
	}
	
}
