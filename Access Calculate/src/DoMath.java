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
	}
}
