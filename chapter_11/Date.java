package chapter_11;

public class Date {
	
	private int year;
	private int month;
	private int day;


	public Date() {
	    this.year = 0;
	    this.month = 0;
	    this.day = 0;
	}
	
	public Date(int year, int month, int day) {
	    this.year = year;
	    this.month = month;
	    this.day = day;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date birthday = new Date(2005, 3, 16);
	}

}
