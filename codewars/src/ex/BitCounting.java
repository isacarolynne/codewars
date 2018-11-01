package ex;

//6
public class BitCounting {

	public static void main(String[] args) {

		System.out.println(countBits(1234));
	}

	public static int countBits(int n) {

		if (n < 0) {
			
			return -1;
		}else {
		String bin = Integer.toString(n, 2);
		
		char[] binChar = bin.toCharArray();
		int a=0;
		for (int i = 0; i < binChar.length; i++) {
			char c = binChar[i];
			
			if(c == '1') {
			a++;
			
		}}
		
		return a;
	}
	}
}
