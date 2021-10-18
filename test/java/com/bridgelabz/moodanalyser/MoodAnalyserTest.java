package com.bridgelabz.moodanalyser;

import org.junit.Test;

import junit.framework.Assert;

public class MoodAnalyserTest {
// Test case to analyze sad mood of the user

	// Test case to analyze sad mood of the user
	@Test
	public void givenMessageWhenProperShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String actualResult = MoodAnalyser.analyseMood();
		Assert.assertEquals("Sad", actualResult);
	}

	// Test case to analyze happy mood of the user
	@Test
	public void givenMessageContainsAnyInitShouldReturnHappy() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I am in Happy Mood");
		String actualResult = MoodAnalyser.analyseMood();
		Assert.assertEquals("Happy", actualResult);
	}

	@Test
	public void givenMessage_Null_ShouldReturnHappy() {
		MoodAnalyser moodanalyser = new MoodAnalyser(null);
		String actualResult = MoodAnalyser.analyseMood();
		Assert.assertEquals("Happy", actualResult);
	}
}
