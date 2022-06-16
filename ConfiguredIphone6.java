package oopExam;

public class ConfiguredIphone6 extends Iphone6 {
	@Override
	public void iphone6(int a, int b, int c, int d, int e, int f) {
		int total1 = a + b + c + d + e + f;
		System.out.println( total1);
	}
	/*public final int iphone6(int m, int o, int p) { // final cannot be override
		int total2 = m + o - p;
		System.out.println(total2);
		return total2;
		*/
	public static int iphone6(int g, int i) {
		int total3 = g - i;
		System.out.println(total3);
		return total3;
	}
}
