public class Range {
	public static void main(String [] args) {
		int start = Integer.parseInt(args [0]);
		int end = Integer.parseInt(args [1]);
		int step = Integer.parseInt (args [2]);
		int i = start;
		if (step <= 0) {
			System.out.println("Step must be > 0");
		}
		else {
			while (i != end && i < end) {
			System.out.println(i);
			i = i + step; 
			}	
		}
	}
}
