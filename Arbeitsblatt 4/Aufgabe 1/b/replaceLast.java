import java.util.Arrays;

public class replaceLast {
	public static void main(String [] args) {
		int [] ar = {1, 2, 3, 2, 2};
		replaceLast (2, 7, ar);
		System.out.println (Arrays.toString (ar));
	}
	public static int[] replaceLast(int x, int y, int [] arr){
	
	for (int i = arr.length -1; i >= 0; i--){
		if (arr[i] == x) {
			arr[i] = y;	
			i = -1;
		}
	
	}
	return arr;
	}  
}
