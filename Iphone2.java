package oopExam;

public class Iphone2 extends Iphone1  {
	char userOfIphone2 = 'M';

	public Iphone2() {
		super();
		super.r = 10;
		super.regularClassInfo();

	}

	public Iphone2(char userOfIphone2) {
		super(10, "Rayhan", 'M', false);
		super.r = 10;
		super.regularClassInfo();
		this.userOfIphone2 = userOfIphone2;

	}

	public void iPhone2Info() {
		super.r = 10;
		super.regularClassInfo();

	}

	public void iPhone2Info(char userOfIphone2) {
		super.r = 10;
		super.regularClassInfo();
		this.userOfIphone2 = userOfIphone2;

	}

	public void dropbox() {
		System.out.println("Dropbox is a file hosting service operated by the American company Dropbox, Inc.");
	}

}
