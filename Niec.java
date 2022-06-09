package hw11Polymorphism;

public class Niec extends Sister {

	@Override
	public void sister(int age1, int age2, int age3, int age4, int age5, int age6) {
		int total0 = age1 / age2 - age3 - age4 - age5;
		System.out.println("Void total is: " + total0);

	}

	@Override
	public int sister(int age1, int age2, int age3, int age4, int age5) {
		int totalAge = age1 * age2 + age3 / age4 - age5;
		System.out.println("Total age is: " + totalAge);
		return totalAge;
	}
	/*
	 * static method can't be override, if we remove @override it will work as
	 * 
	 * @Override public static int sister (int age1, int age2,int age3,String age4)
	 * { int totalAge2 = age1 * age2 + age3 / Integer.parseInt(age4);
	 * System.out.println("Total age is: " + totalAge2); return totalAge2; } its
	 * cannot be possible to Override because this is final, final method cannot be
	 * changed.
	 * 
	 * @Override public final int sister (int age1, int age2,int age3,int age4) {
	 * int totalAge3 = age1-age2 + age3 * age4; System.out.println("Total age is: "
	 * + totalAge3); return totalAge3; }
	 * 
	 * 
	 * 
	 */
}
