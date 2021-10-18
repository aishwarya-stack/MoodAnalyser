package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

	public static String message;

	// Constructor
	public MoodAnalyser(String message) {
		this.message = message;
		analyseMood();
	}

	// Getter
	public String getMessage() {
		return message;
	}

	// Setter
	public void setMessage(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (message.toLowerCase().contains("sad")) {
			return "Sad";
		}
		return "Happy";
	}
}
