public class ausgabe {
	public static void main(String [] args) {
		StdOut.printf ("<%10d>%n",		1234);
		StdOut.printf ("<%-10d>%n",		1234);
		StdOut.printf ("<%10.3f>%n",	1234.567891011121314);
		StdOut.printf ("<%.5f>%n",		1234.567891011121314) ;
		StdOut.printf ("<%14.6e>%n",	1234.567891011121314);
		StdOut.printf ("<%10.5s>%n",	"EinsZweiDreiVier");
	}
}
