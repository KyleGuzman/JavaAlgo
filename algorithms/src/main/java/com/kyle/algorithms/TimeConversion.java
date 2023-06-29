package com.kyle.algorithms;

//Given a time in -hour AM/PM format, convert it to military (24-hour) time.
//
//Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
//- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
//
//Example
//
//
//Return '12:01:00'.
//
//
//Return '00:01:00'.
//
//Function Description
//
//Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.
//
//timeConversion has the following parameter(s):
//
//string s: a time in  hour format
//Returns
//
//string: the time in  hour format
//Input Format
//
//A single string  that represents a time in -hour clock format (i.e.:  or ).

public class TimeConversion {
	public static String algo(String s) {
		String military = "";
		if(s.substring(s.length()-2).equals("PM") && !s.substring(0, 2).equals("12") ) {
			int hour = Integer.parseInt(s.substring(0, 2)) + 12;
			String newHour = Integer.toString(hour);
			military = newHour + s.substring(2, s.length() - 2);
		}
		else if(s.substring(s.length()-2).equals("AM") && s.substring(0, 2).equals("12") ) {
			military = "00" + s.substring(2, s.length() - 2);
		}
		else {
			military = s.substring(0, s.length() - 2);
		}
		return military;
	    }
}
