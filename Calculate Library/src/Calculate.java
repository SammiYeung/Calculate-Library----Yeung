/*This class contains methods that perform various math operations
 * @author Sammi Yeung
 * @version September 6, 2018
 */
public class Calculate { //returns square of input
	public static int square(int number) {
		int answer;
		answer = number*number;
		return answer; 
	}

	public static int cube(int number) { //returns cube of input
		int answer;
		answer = number*number*number;
		return answer; 
	}
	
	public static double average(double num1, double num2) { //returns average of inputs (two doubles)
		double sum;
		sum = num1+num2;
		return sum/2; 
	}
	
	public static double average(double num1, double num2, double num3) { //returns average of input (three doubles)
		double sum;
		sum = num1+num2+num3;
		return sum/3; 
	}
	
	public static double toDegrees(double deg) { //converts radians to degrees
		double product;
		product = (180/3.14159)*deg;
		return product; 
	}
	
	public static double toRadians(double rad) { //converts degrees to radians
		double product;
		product = (3.14159/180)*rad;
		return product; 
	}
	
	public static double discriminant(double a, double b, double c) { //calculates discriminant from input
		double product = (b*b)-(4*a*c);
		return product; 
	}
	
	public static String toImproperFrac(int wholenum, int numerator, int denominator) { //converts mixed number to improper fraction
		int answernumerator;
		String answer;
		answernumerator= (wholenum*denominator)+numerator;
		answer = (answernumerator+  "/" + denominator); 
		return answer; 
	}
	
	public static String toMixedNum(int num, int denom) { //converts improper to mixed fraction
		String answer;
		int wholenum = (num/denom);
		int newnumer = (num%denom);
		answer = (wholenum+ "_" + newnumer+"/"+denom); 
		return answer; 
	}
	
	public static String foil(int a, int b, int c, int d, String x) { //foils for binomial multiplication
		String answer;
		int endax = (a*c);
		int endbx = (b*c)+(a*d);
		int endc = (b*d);
		answer = (endax+x+"^"+"2"+" + "+endbx+x+" + "+endc); 
		return answer; 
	}
	
	public static boolean isDivisibleBy(int a, int b) { //returns true if a is divisible by b
		if (b==0) throw new IllegalArgumentException("numbers cannot be divided by zero as it is undefined");
		if (a%b == 0) {
	    return true;
		}
		else
		return false;
	}
	
	public static double absValue(double a) { //returns absolute value of input
		if (a<0) {
			return (a*-1);
		}
			else
				return a;
	}
	
	public static double max(double a, double b) { //find the max between the inputed values (2)
		if (a>b) {
		return a;
		}
		else
		return b;
	}
	
	public static double max(double a, double b, double c) { //find the max between the inputed values (3)
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
			return (int)newnum2/100;
	}
	
	public static double exponent(double base, int exponent) {
		double answer=1;
		if (exponent<=0) throw new IllegalArgumentException("negative exponents cannot be accepted, input a positive exponent");
		for(int i=0;i<exponent;i++)
			answer *= base;
		return answer;
	}
	
	public static int factorial(int a) { //returns factorial of value passed
		int answer=1;
		if (a<=0) throw new IllegalArgumentException("factorials only exist for positive numbers, please input a positive integer");
		for(int i=1;i<=a;i++)
			answer=answer*=i;
		return answer;	
	}
	
	public static boolean isPrime(int a) { //determines whether input is prime
		boolean answer = true;
		if (a==1) throw new IllegalArgumentException("1 is neither prime nor composite");
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
		if (a<0) throw new IllegalArgumentException("Square roots of negative numbers are imaginary, please input a positive double");
			while(diff>= 0.005) {
				approx = ((a/approx)+approx)/2;
				diff = Calculate.absValue(a - (approx*approx));
			}
			return Calculate.round2(approx);
	}
	
	public static void quadForm(int a, int b, int c) { //approximates real roots usi;ng quadratic formula
		double numanswer1 = (-b + Calculate.sqrt(Calculate.discriminant(a, b, c)));
		double denomanswer = 2*a;
		double trueanswer1 = numanswer1/denomanswer;
		double numanswer2 = (-b - Calculate.sqrt(Calculate.discriminant(a, b, c)));
		if(Calculate.discriminant(a, b, c)==)
		System.out.println("no real roots");
		System.out.println(trueanswer);
		System.out.println(trueanswer1");
	}
	

		
		
		
		
		
}