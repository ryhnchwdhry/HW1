package hw11Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		System.err.println("This is from sister class>");

		Sister sister = new Sister();
		sister.sister(1, 2, 3, 4, 5, 6);
		sister.sister(1, 2, 3, 4, 5);
		sister.sister(1, 2, 3, 4);
		Sister.sister(1, 2, 3, "4");

		System.err.println("This is from niec class>    ");

		Sister sister1 = new Sister();
		sister1.sister(1, 2, 3, 4, 5, 6);
		sister1.sister(1, 2, 3, 4, 5);

	}
}
