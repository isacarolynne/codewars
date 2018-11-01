package ex;

public class TriangleTester {

	public static void main(String[] args) {

		System.out.println(isTriangle(1,2,2));
		System.out.println(isTriangle(7,2,2));

	}
	 public static boolean isTriangle(int a, int b, int c){
		   return ((c < a+b) && (b < c+a) && (a < c+b));
		  }
		      
}
