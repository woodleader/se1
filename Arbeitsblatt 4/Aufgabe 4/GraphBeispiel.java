public class GraphBeispiel {
	public static void main(String [] args) {
		double width = Double.parseDouble(args [0]);
		double gap = Double.parseDouble(args [1]);
		
		String[] a = new String[5];
		double[] b = new double[5];
		int n = 0;
	
		while (!StdIn.isEmpty () ) {
			if (n < a.length && n < b.length) {
				a[n] = StdIn.readString();
				b[n] = StdIn.readDouble();
				n = n + 1; 
			}
			else
			{
				String[] a2 = new String[a.length*2];
				for(int i = 0; i < a.length; i++) {
				a2[i] = a[i]; }
				a = a2;
				double[] b2 = new double[b.length*2];
				for(int i = 0; i < b.length; i++) {
				b2[i] = b[i]; }
				b = b2;
			
			}
			
		}
		
		drawBars(a, b, width, gap);
	}
	
	public static void drawBar(double x, double width, String text, double height) {
		StdDraw.text(x , 0.1, text);
		double height2 = height*0.7/2 ;
		StdDraw.filledRectangle(x, (height2 + 0.2), (width/2), height2);
	
	}
	public static void drawBars(String[] labels, double[] heights, double width, double gap) {
		double 	p = 0;
		for (int i = 0; i < labels.length; i++){
		drawBar(p + gap+(width/2),width, labels[i], heights[i]);
		p = p + gap + width;
		}
	
	}
}
