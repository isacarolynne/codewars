package ex;
//6
public class SortArray {

	public static void main(String[] args) {
		
		int[] v = sortArray(new int[] {5, 3, 2, 8, 1, 4});
		
		for (int k = 0; k < v.length; k++) {
			System.out.print(v[k]+" ");
		}
		
	}
	
	public static int[] sortArray(int[] array) {
		
		int i, j;
		
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array.length; j++) {
				
				if ((array[i] % 2 != 0) && (array[j] % 2 != 0)) {
					if (array[i] < array[j]) {
						
						int aux = array[i];
						array[i] = array[j];
						array[j] = aux;
					}
				}
			}
		}
		
		
		return array;
	}

}
