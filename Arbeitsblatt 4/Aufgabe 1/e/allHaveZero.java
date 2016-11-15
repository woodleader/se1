import java.util.Arrays;

public class allHaveZero {
	public static void main(String [] args) {
	int [][] a1 = {{1 ,2 ,0} , {0,7}, {7 ,0 ,7}};
	int [][] a2 = {{1 ,2 ,0} , {4 ,5 ,6}};
	System.out.println ( allHaveZero (a1)); //Gibt "true" aus
	System.out.println ( allHaveZero (a2)); //Gibt "false" aus
	}
	public static boolean allHaveZero(int [][] ar1){
	boolean a = false; //ergebnis init
	
	for (int i = 0; i < ar1.length; i++){  //Geht jeden Array im Array durch
		a = false;							//setzt bei jedem Array die variable neu auf false
		for (int j = 0; j < ar1[i].length; j++) {
			if (ar1[i][j] == 0) {
			a = true;							//und setzt sie auf true wenn eine null vorkommt
			}	
		} 
	
	}
	return a;
	}  
}
