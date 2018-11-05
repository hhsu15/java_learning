package hsin;

public class multi_constructor {
	private int hour;
	private int minute;
	private int second;
	
	public multi_constructor(){ //constructor
		this(0,0,0); //invoke the constructor with 3 arguments
	}
	
	public multi_constructor(int h){ //constructor
		this(h,0,0);
	}
	
	public multi_constructor(int h, int m){ //constructor
		this(h,m,0);
	}
	
	public multi_constructor(int h, int m, int s){ //constructor
		setTime(h,m,s);
	}
	
	public void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
		
	}
	public void setHour(int h) {
		hour = (h>=0&&h<24? h:0);
	}
	
	public void setMinute(int m) {
		minute = (m>=0&&m<60? m:0);
	}
	
	public void setSecond(int s) {
		second = (s>=0&&s<60? s:0);
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
		
	}
	public int getSecond() {
		return second;
	}
	
	public String toMilitary() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
}
