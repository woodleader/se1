import java.util.Arrays;

public class readStrings {
	public static void main(String [] args) {
	String [] a = new String[5];
	int n = 0;
	
		while (!StdIn.isEmpty () ) {
			if (n < a.length) {
				a[n] = StdIn.readString();
				n = n + 1; 
			}
			else
			{
				String[] a2 = new String[a.length*2];
				for(int i = 0; i < a.length; i++) {
				a2[i] = a[i]; }
				a = a2;
			
			}
			
		}
	System.out.println(Arrays.toString(a));
	}
}

	
	

