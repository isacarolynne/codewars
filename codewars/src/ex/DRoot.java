package ex;
//6
public class DRoot {

	public static void main(String[] args) {

		System.out.println(digital_root(16));
		System.out.println(digital_root(456));
	}

	public static int digital_root(int n) {

		if (n < 10)
			return n;
		else {
			do {

				n = digital_root(n / 10) + n % 10; 
			} while (n > 10);

			return n;
		}
	}
}
