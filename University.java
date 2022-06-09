package hw11Abstraction;

public interface University extends College, Hospital  {
	
	/*
	 * One keywords are used for the inheritance in Interface which is extends.
	 * Yes interface inherit other Interfaces, Yes a regular class or abstract class by extends or implements keyword.
	 *  Interface one and more, regular class and abstract class only can extends one, inheritance is possible.
	 */
	public void classSize();

	public void playGround();

	public void teacher();

//	public University() {} cannot have a constructor within an interface in Java

	public default void gymnasium() {
	}

	public static void library() {
	}
	public default void rayhan1() {
		
	}
}