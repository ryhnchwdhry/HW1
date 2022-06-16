package oopExam;

public class TestPhone {

	public static void main(String[] args) {
		Iphone1 iphone1 = new Iphone1();
		iphone1.abstractClassInfo();
		iphone1.appleWatchInfo();
		iphone1.interfaceInfo();
		iphone1.call();
		iphone1.camera();
		iphone1.message();
		iphone1.digitalWatchinterface();
		iphone1.regularClassInfo();
		iphone1.wireless();

		iphone1.setPrice(750);
		iphone1.setInfo("I bought this phone in 2000 ");
		iphone1.setM('M');
		iphone1.setMadeInUSA(false);
		System.out.println(iphone1.getInfo() + iphone1.getPrice() + iphone1.getM() + " " + iphone1.isMadeInUSA());

		Iphone2 iphone3 = new Iphone2();
		Iphone2 iphone4 = new Iphone2('M');

		Iphone2 iphone2 = new Iphone2();
		iphone2.iPhone2Info();
		iphone2.iPhone2Info('M');

		Iphone6 iphone6 = new Iphone6();
		iphone6.iPhone2Info();// single
		iphone6.iphone4();// Multilevel
		iphone6.iphone5();
		iphone6.iphone6();// hierarchical

		Iphone6 ip = new Iphone6();
		ip.iphone6(5, 10, 15, 20, 30, 40);
		ip.iphone6(5, 10, 15);
		Iphone6.iphone6(5, 10);

		ConfiguredIphone6 con = new ConfiguredIphone6();
		con.iphone6(10, 10, 16, 20, 3, 5);
		ConfiguredIphone6.iphone6(4, 8);

	}

}
