package hw11Polymorphism;

public class Sister {
	public int age1;
	public int age2;
	public int age3;
	public int age4;
	public int age5;
	public int age6;

	public void sister(int age1, int age2, int age3, int age4, int age5, int age6) {
		int total0 = age1 + age2 + age3 - age4 - age5;
		System.out.println("Void total is: " + total0);

	}

	public int sister(int age1, int age2, int age3, int age4, int age5) {
		int totalAge = age1 + age2 + age3 + age4 - age5;
		System.out.println("Total age is: " + totalAge);
		return totalAge;
	}

	public static int sister(int age1, int age2, int age3, String age4) {
		int totalAge2 = age1 + age2 + age3 - Integer.parseInt(age4);
		System.out.println("Total age is: " + totalAge2);
		return totalAge2;
	}

	public final int sister(int age1, int age2, int age3, int age4) {
		int totalAge3 = age1 + age2 + age3 * age4;
		System.out.println("Total age is: " + totalAge3);
		return totalAge3;
	}
	/*
	 * When different methods exist with the same method name but with different
	 * parameters or signature, it is called method overloading When different
	 * methods exist with the same method name with same parameters or signature but
	 * with different syntax or logic, it is called method overriding
	 */
}
