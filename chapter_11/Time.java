package chapter_11;

public class Time {
	
	private int hour;
    private int minute;
    private double second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    public Time(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public void increment(double seconds) {
        this.second += seconds;
        while (this.second >= 60.0) {
            this.second -= 60.0;
            this.minute += 1;
        }
        while (this.minute >= 60) {
            this.minute -= 60;
            this.hour += 1;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time startTime = new Time(18, 50, 0.0);
		Time runningTime = new Time(2, 16, 0.0);
		startTime.increment(runningTime.second);
	}

}
