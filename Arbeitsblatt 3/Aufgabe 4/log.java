public class log { // log
	public static void main ( String [] args ) {
		int x = Integer.parseInt(args [0]);
		int b = Integer.parseInt(args [1]);
		int n = 0;
		double z = 1;
		
	while(z<=x) // 
	{
		z = z * b;
		System.out.println("step:" + z);
		n = n + 1;
	}
		System.out.println("Log:" + (n-1);
	}
}
