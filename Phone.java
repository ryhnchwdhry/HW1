package oopExam;

/*
 * 1) Interface is a Blueprint of Class.
 *  Interface can inherit more than one Interface by extends keyword.
 *  Interface extends regular class by an implements keyword, also can extends one and more interface.
 *  Not mandatory to put abstract keyword with the abstract method inside Interface.
 *  Interface has default method which is not access modifier.
 *  Also cannot be instantiated.
 *  Method  are declared, can be implemented through static and default method.
 *  Also called abstract method.
 *  By nature all method are abstract.
 *  From Java 1.8, JAVA implemented static and default type method in interface which are implemented.
 */
public interface Phone extends Pager, Wakitoki {
	public int r = 1;

	/*
	 * Contractor cannot support on interface.
	 */
	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	public static void battery() {
		System.err.println("battery is a static method from interface which is non static method\n");
	}

	public default void wireless() {
		System.err.println("wireless is a static method from interface which is default method\n");
	}
}
