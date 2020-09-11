package practice;

import java.io.IOException;

public class TimeM{
	
	public static void main(String[] args)  throws IOException 
	{
		
		Time ti = new Time(2 , 45 , 39);
		
		System.out. println("Time is : " +ti.getHour());
		//System.out. println("Time is : " +ti);
		String s;
		
		 s = ti.toString();
		System.out. println("Time is : " + s);
		
		System.out. println("Time is : " + ti.nextSecond());
		
	}

}
