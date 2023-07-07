

class Time{
	
	int hour;
	int minute;
	int second;
	
	
	
	Time(int hour, int minutes, int seconds){
		this.hour = hour;
		this.second = seconds;
		this.minute = minutes;
		
		
	}
	
	public void increament() {
		if (this.second>59) {
			this.minute = this.minute + (int)this.second/60;
			this.second = (int)this.second%60;
		}
		if (this.minute>59) {
			this.hour = this.hour + (int)this.minute/60;
			this.minute = (int)this.minute%60;
		}
		if (this.hour>23) {
			this.hour = (int)this.hour%24;
		}
	}
	
	
	public int isValidHour() {
		if (this.hour>=24)
			return this.hour%24;
		else 
			return this.hour;
	}
	
	public int isValidMinute() {
		if (this.minute>=60)
			return this.minute%60;
		else 
			return this.minute;
	}
	
	public int isValidSecond() {
		if (this.second>=60)
			return this.second%60;
		else 
			return this.second;
	}
	
	
	public static void main(String[] args) {
		Time t1 = new Time(26,66,30);
		//System.out.println(t1.isValidHour() +":"+ t1.isValidMinute() +":"+ t1.isValidSecond());
		t1.increament();
		System.out.println(t1.isValidHour() +":"+ t1.isValidMinute() +":"+ t1.isValidSecond());
		
		
	}
}