package hw11Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	/*
	 *  Two keyword used inheritance are in abstract class which is extends and implements, extend for regular class and implements for interface.
	 *   Abstract Class inherit other Abstract Class, a regular class extends interface by implements keyword.
	 *   Only one for regular class and interface one and more inheritances is possible by an Abstract Class.
	 */

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is non abstract method");
	}

	public MedicalSchool() {
	}
	
}

