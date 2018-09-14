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
	public static String toImproperFrac(int wholenum, int numerator, int denominator) {
		int answernumerator;
		String answer;
		answernumerator= (wholenum*denominator)+numerator;
		answer = (answernumerator+  "/" + denominator); //converts mixed number to improper fraction
		return answer; 
	}
	public static String toMixedNum(int num, int denom) {
		String answer;
		int wholenum = (num/denom);
		int newnumer = (num%denom);
		answer = (wholenum+ "_" + newnumer+"/"+denom); //converts improper to mixed fraction
		return answer; 
	}
	public static String foil(int a, int b, int c, int d, String x) {
		String answer;
		int endax = (a*c);
		int endbx = (b*c)+(a*d);
		int endc = (b*d);
		answer = (endax+x+"^"+"2"+" + "+endbx+x+" + "+endc); //foils for binomial multiplication
		return answer; 
	}
	public static boolean isDivisibleBy(int a, int b) { //returns true if a is divisible by b
		if (a%b == 0) {
	    return true;
		}
		else
		return false;
	}
	public static double absValue(double a) { //returns absvalue of input
		if (a<0) {
			return (a*-1);
		}
			else
				return a;
	}
	public static double max(double a, double b) {
		if (a>b) {
		return a;
		}
		else
		return b;
	}
	public static double max(double a, double b, double c) {
		if (a>b) {
		return a;
		}
		else if (b>a)
		return b;
		else if (c>b)
		return c;
		else if (c>a)
		return c;
		return c;
		}
	}

		