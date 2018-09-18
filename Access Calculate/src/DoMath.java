/*This class is client code that used the Calculate Library to perform various mathematical tasks.
 * @author Sammi Yeung
 * @version September 6, 2018
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(3));
		System.out.println(Calculate.cube(3));
		System.out.println(Calculate.average(4.1, 4.3));
		System.out.println(Calculate.average(4.1, 4.3, 4.5));
		System.out.println(Calculate.toDegrees(3.14159));
		System.out.println(Calculate.toRadians(360));
		System.out.println(Calculate.discriminant(2,3,4));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(2,3,6,-7,"n"));
		System.out.println(Calculate.isDivisibleBy(5,3));
		System.out.println(Calculate.absValue(-6));
		System.out.println(Calculate.max(9, 7));
		System.out.println(Calculate.max(9, 7, 10));
		System.out.println(Calculate.round2(123.63578));
		System.out.println(Calculate.exponent(2,9));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.isPrime(7));
		//System.out.println(Calculate.gcf(7));
		System.out.println(Calculate.sqrt(16));
	}
}
