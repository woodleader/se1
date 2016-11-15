import java.util.Arrays;

public class replaceall {
	public static void main(String [] args) {
		int [] ar = {1, 2, 3, 2, 4};
		replaceAll (2, 7, ar);
		System.out.println (Arrays.toString (ar));
	}
	public static int[] replaceAll(int x, int y, int [] arr){
	
	for (int i = 0; i < arr.length; i++){
		if (arr[i] == x) {
			arr[i] = y;	
		}
	
	}
	return arr;
	}  
}
