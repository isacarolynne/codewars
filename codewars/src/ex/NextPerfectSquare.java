package ex;

public class NextPerfectSquare {

	public static void main(String[] args) {

		System.out.println(findNextSquare(114));
		System.out.println(findNextSquare(121));
	}
	public static long findNextSquare(long sq) {

		if (Math.sqrt(sq) == (int)Math.sqrt(sq)) {
			long num = (long)Math.sqrt(sq);
			num++;
			
			return num * num;
		} else {
			return -1;
		}
		
	  }

}
