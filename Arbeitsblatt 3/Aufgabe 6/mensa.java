public class mensa { // log
	public static void main ( String [] args ) {
		int min = Integer.parseInt(args [0]);
		int max = Integer.parseInt(args [1]);
		int diff = max - min;
		int aus = Integer.parseInt(args [2]);
		int l = 0;
		int t = 0;
		
	while(t!=120) // 
	{
		//System.out.println("step1:" + l);
		l = l + (int)(Math.random() * diff) + min;
		//System.out.println("step2:" + l);
		l = l - aus;
		if (l < 0) {
			l = 0;
		}
		System.out.println("Minute"+ t +":" + l);
		t = t+1;
	}
		System.out.println("Minute"+ t +":" + l);
	}
}
