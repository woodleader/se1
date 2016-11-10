public class Windchill { //
	public static void main (String [] args) {
		double t = Double.parseDouble(args [0]);
		double v = Math.pow(Double.parseDouble(args [1]),0.16);
		double wct;
		
		wct = 13.12 + 0.6215*t;
		wct = wct - 11.37*v;
		wct = wct + 0.3965*t*v;
		
		System.out.println (wct);
		
	}
}
