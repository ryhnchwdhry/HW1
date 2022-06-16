package oopExam;

public class Iphone6 extends Iphone5 {
	public void iphone6() {
		System.out.println(
				"Printed on 100% cotton watercolour textured paper, Compass art prints would be at home in any gallery.");

	}

	/*
	 * The concept is inheritance. Different methods exist with the same method name
	 * but with different parameters or signature, it is called method overloading.
	 * Method Overloading occurs during compile time. different methods exist with
	 * the same method name with same parameters or signature but with different
	 * syntax or logic, it is called method overriding. Method Overriding occurs
	 * during run time. Polymorphism method overloading.
	 */
	public void iphone6(int a, int b, int c, int d, int e, int f) {
		int total1 = a + b + c + d + e + f;
		System.out.println(total1);
	}

	public final int iphone6(int m, int o, int p) {
		int total2 = m + o - p;
		System.out.println(total2);
		return total2;
	}

	public static int iphone6(int g, int i) {
		int total3 = g - i;
		System.out.println(total3);
		return total3;
	}

}
