/*
 * Errechnung des BMI-Wertes 
 * BMI= K�rpergewicht / K�rpergr��e � 
 */
public class App {

	public static void main(String[] args) {
	/*	double gewicht; // dekleration
		gewicht = 86.6;	// initialisierung
	*/	
		double gewicht = 86.6; //dekleration und initialisierung in einem Schritt
		double groesse = 1.82;
		double bmi = gewicht / (groesse * groesse);
		
		System.out.printf("Das Gewicht %.2f kg und die Gr��e %.2f m ergeben den BMI Wert %.2f",gewicht,groesse,bmi);
		
		
		
		
		/*System.out.println(
				"Das Gewicht " + gewicht +
				" kg und die Gr��e " + groesse +
				" m ergeben den BMI Wert " + bmi);*/
	}

}
