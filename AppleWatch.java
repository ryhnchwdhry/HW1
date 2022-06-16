package oopExam;
/*
 *  Abstract class is a super class.
 *  Abstract class can contains abstract and non abstract methods.
 *  Abstract class cannot be instantiated, also we cannot create objects of an abstract class.
 *  we must have to put abstract keyword in abstract class.
 *  Abstract method can not be implemented, can be defined,declared only.
 *  Abstract class can inherit only one abstract class or one regular class by extends key word.
 *  Abstract class can't inherit an Interface by extends key word.
 *  When method is declared, that method is also called abstract method
 *  Mandatory to put abstract keyword with the abstract method inside Abstract Class.
 *  We Have to create at least one abstract method inside abstract class.
 */

public abstract class AppleWatch implements Watch, DigitalWatch {
	/*
	 * We can create a variable and constructor in abstract class, but cannot be
	 * instantiate it.
	 */

	public void abstractClassInfo() {
		System.out.println("  Regular class contains veriavle,constructor,method also instentiateble\n"
				+" Abstract class is a super class can contain abstract and non abstratc method\n"
				+ "Interface is a Blueprint of Class, cannot be instentiatble \n");

	}

	public abstract void appleWatchInfo();

}
