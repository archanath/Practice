package practice;

public class Time {
	
	 private int hour;
	 private int minute;
	 private int second;
	
	public Time(){
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}

	public	Time(int h, int m, int s){
		this.hour = h;
		this.minute = m;
		this.second = s;
		
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

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(int h,int m, int s) {
		
		this.hour = h;
		this.minute = m;
		this.second = s;
		
	}
	
	public String toString() {
		
//		String s ="";
//		
//		if (hour < 10 && minute < 10 && second < 10) {
//			s= "0 " + hour + " 0 " + minute + "0" + second;
//			}
//		else if(hour < 10 && minute > 10 && second <10) {
//			s= "0" + hour + minute + "0" + second;
//		}else if(hour > 10 && minute <10 && second <10) {
//			s = hour + "0" + minute + "0" + second;
//		}else if(hour < 10 && minute < 10 && second >10) {
//			s = "0"+ hour + "0" + minute + second;
//		}else if ( hour > 10 && minute >10 && second >10) {
//			s = hour + " " + minute + " " + second;
//		} else if (hour == 0) {
//			s = "0" + hour + minute + second;
//		} else if (minute == 0) {
//			s = hour +"0" +  minute + second;
//		} else if (second == 0) {
//			s = hour + minute +"0" +  second;
//		}
			
		
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public Time nextSecond() {
		++second;
	      if (second >= 60) {
	         second = 0;
	         ++minute;
	         if (minute >= 60) {
	            minute = 0;
	            ++hour;
	            if (hour >= 24) {
	               hour = 0;
	            }
	         }
	      }
		
		
		return this;
	}
	
}
