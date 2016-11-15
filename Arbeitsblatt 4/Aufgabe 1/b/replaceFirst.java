import java.util.Arrays;

public class replaceFirst {
	public static void main(String [] args) {
		int [] ar = {1, 2, 3, 2, 4};
		replaceFirst (2, 7, ar);
		System.out.println (Arrays.toString (ar));
	}
	public static int[] replaceFirst(int x, int y, int [] arr){
	
	for (int i = 0; i < arr.length; i++){
		if (arr[i] == x) {
			arr[i] = y;	
		i = arr.length;
		}
	
	}
	return arr;
	}  
}
