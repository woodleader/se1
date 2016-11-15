public class Table {
	public static void main(String[] args) {
	int n = Integer.parseInt(args[0]);
	int m = 1;
		
	while (!StdIn.isEmpty ()) {
		if (m < n) {
			
		StdOut.printf("%10.2f |", StdIn.readDouble ());
		m = m + 1;
			
		}
		else {
		StdOut.printf("%10.2f%n", StdIn.readDouble ());
		m = 1;				
		}
					
	}
	}
	
}



