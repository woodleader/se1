

public class SqrtTable {
	public static void main(String [] args) {
	double input = 0;
	double sqrt = 0;
	while (!StdIn.isEmpty () ) {
	input = StdIn.readDouble ();
	sqrt = Math.sqrt(input);
	
	StdOut.println("Sqrt: " + sqrt + " von " + input);
	}
	
	}
}
