/*This class contains methods that perform various math operations
 * @author Sammi Yeung
 * @version September 6, 2018
 */
public class Calculate {
	public static int square(int number) {
		int answer;
		answer = number*number;
		return answer; //returns square of input
	}

	public static int cube(int number) {
		int answer;
		answer = number*number*number;
		return answer; //returns cube of input
	}
	public static double average(double num1, double num2) {
		double sum;
		sum = num1+num2;
		return sum/2; //returns average of input (two doubles)s
	}
	public static double average(double num1, double num2, double num3) {
		double sum;
		sum = num1+num2+num3;
		return sum/3; //returns average of input (three doubles)
	}
	public static double toDegrees(double number) {
		double product;
		product = (180/3.14159)*number;
		return product; //converts radians to degrees
	}
	public static double toRadians(double number) {
		double product;
		product = (3.14159/180)*number;
		return product; //converts degrees to radians
	}
	public static double discriminant(double a, double b, double c) {
		double product = (b*b)-(4*a*c);
		return product; //calculates discriminant from input
	}
	public static int toImproperFrac(int wholenum, int numerator, int denominator) {
		int answernumerator;
		String answer;
		answernumerator= (wholenum*denominator)+numerator;
		answer = (answernumerator+  "/" + denominator); //converts mixed number to improper fraction
		return answer; 
	}

	}
}