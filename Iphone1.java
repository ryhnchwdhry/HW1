package oopExam;

public class Iphone1 extends AppleWatch implements Phone {

	private int price;
	private String Info;
	private char M;
	private boolean madeInUSA;
	
	public int r;

	public int getPrice() {
		return price;
	}

	public String getInfo() {
		return Info;
	}

	public char getM() {
		return M;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setInfo(String info) {
		Info = info;
	}

	public void setM(char m) {
		M = m;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	public Iphone1() {

	}

	public Iphone1(int price, String info, char m, boolean madeInUSA) {
		super();
		this.price = price;
		Info = info;
		M = m;
		this.madeInUSA = madeInUSA;
	}

	@Override
	public void pager() {
		// TODO Auto-generated method stub

	}

	@Override
	public void wakitoki() {
		// TODO Auto-generated method stub

	}

	@Override
	public void watchinterface() {
		// TODO Auto-generated method stub

	}

	@Override
	public void digitalWatchinterface() {
		// TODO Auto-generated method stub

	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub

	}

	public void regularClassInfo() {
		System.out.println(" Regular class contains veriavle,constructor,method also instentiateble\n"
				+ " Abstract class is a super class can contain abstract and non abstratc method\n"
				+ "Interface is a Blueprint of Class, cannot be instentiatble \n");

	}

	public void youtube() {
		System.out.println(
				"YouTube is an American online video sharing and social media platform headquartered in San Bruno, California.");
	}
}
