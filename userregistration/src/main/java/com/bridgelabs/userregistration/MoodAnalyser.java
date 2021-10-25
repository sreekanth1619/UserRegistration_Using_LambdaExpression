package com.bridgelabs.userregistration;
/**
 * Purpose  - Mood Analyser for user
 * @author  - N Sreekanth
 * @version - 16.0
 */

public class MoodAnalyser {
	 public static String analyseMood(String mood) {
	        if (mood.toLowerCase().contains("happy")) {
	            return "Entry Successful";
	        } else if (mood.toLowerCase().contains("sad")) {
	            return "Entry Failed";
	        } else return null;
	    }
}
