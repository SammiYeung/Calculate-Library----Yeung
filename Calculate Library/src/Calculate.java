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
	public static double max(double a, double b) { //find the max between the inputed values
		if (a>b) {
		return a;
		}
		else
		return b;
	}
	public static double max(double a, double b, double c) { //find the max between the inputed values
		if (a>b && a>c) {
		return a; }
		else if (b>a && b>c)
		return b;
		else
		return c;
	}
	public static double round2(double a) { //rounds input to 2 decimal places
		double newnum = a*1000;
		double newnum2 = a*100;
		double answer = newnum%10;
			if (answer >= 5) {
			return (int)(newnum2 + 1)/100;
			}
			else
			return (int)newnum2/100; //DOESN'T WORK
	}
	public static double exponent(double base, int exponent) {
		double answer=1;
		for(int i=0;i<exponent;i++)
			answer *= base;
		return answer;
	}
	public static int factorial(int a) { //returns factorial of value passed
		int answer=1;
		for(int i=1;i<=a;i++)
			answer=answer*=i;
		return answer;
	}
	public static boolean isPrime(int a) { //determines whether input is prime
		boolean answer = true;
		if (a>=4) {
		for(int i=2;i<=7;i++) {
			if (Calculate.isDivisibleBy(a, i)) {
				answer=false; 
			}
		if (a<=3) {
			answer=true; }
		if (a==5) {
			answer=true; }
		if (a==7) {
			answer=true; }
		}
		}
		return answer;
	}

	public static int gcf(int a, int b){  //returns the greatest common denominator of the two inputed numbers
	    int answer = a;
	    if(a>b) {
	    for(int i = b; b>=1; i--) {
	    	if(Calculate.isDivisibleBy(a, i) && Calculate.isDivisibleBy(b, i)) {
	    		return i; 
	    		} 
	    	}
	    }
	    else if(a<b) {
		for(int i = a; a>=1; i--) {
			if((Calculate.isDivisibleBy(a,i)) && (Calculate.isDivisibleBy(b,i))) {
				return i;
			}
		}
	}
	return answer;
	}
	
	public static double sqrt(double a) { //returns approximation of the square root
		double approx = 1.00;
		double diff = 1;
			while(diff>= 0.005) {
				approx = ((a/approx)+approx)/2;
				diff = Calculate.absValue(a - (approx*approx));
			}
			return Calculate.round2(approx);
	}
	//DOESN'T WORK always gives 1.0?
		
		
		
		
		
}