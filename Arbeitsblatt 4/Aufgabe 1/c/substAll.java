import java.util.Arrays;

public class substAll {
	public static void main(String [] args) {
	int [] ar = {1, 2, 3, 2, 4};
	int [] ar2 = substAll (2, 7, ar);
	System.out.println ( Arrays.toString (ar)); // Gibt "[1, 2, 3, 2, 4]" aus
	System.out.println ( Arrays.toString (ar2)); // Gibt "[1, 7, 3, 7, 4]" aus
	}
	public static int[] substAll(int x, int y, int [] arr){
	int[] ar = new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
		ar[i] = arr[i];
	}
	
	for (int i = 0; i < ar.length; i++){
		if (ar[i] == x) {
			ar[i] = y;	
		}
	
	}
	return ar;
	}  
}
