import java.util.Arrays;

public class onlyEven {
	public static void main(String [] args) {
	int [] a1 = {1, 2, 3, 2, 4, 7, 2};
	int [] a2 = onlyEven (a1);
	System.out.println ( Arrays.toString (a1)); // Gibt "[1, 2, 3, 2, 4]" aus
	System.out.println ( Arrays.toString (a2)); // Gibt "[1, 7, 3, 7, 4]" aus
	}
	public static int[] onlyEven(int [] ar1){
	int n = 0; // Anzahl an geraden Werten
	
	for (int i = 0; i < ar1.length; i++){ //Zählt n
		if (ar1[i] % 2 == 0) {
			n = n+1;	
		}
	
	}
	
	int[] ar2 = new int[n];  //Initialisiert neuen Array mit länge n
	
	int n2 = 0;  //Zähler
	for (int i = 0; i < ar1.length; i++){ //Nimmt gerade werte(Ohne Rest bei Teilen durch 2) und setzt sie in neuen Array ein 
		if (ar1[i] % 2 == 0) {
			ar2[n2] = ar1[i];
			n2 = n2 +1;	
		}
	
	}
	return ar2;
	}  
}
