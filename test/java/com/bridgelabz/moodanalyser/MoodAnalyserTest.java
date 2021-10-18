package com.bridgelabz.moodanalyser;

import org.junit.Test;

import junit.framework.Assert;

public class MoodAnalyserTest {
// Test case to analyze sad mood of the user

	@Test
	public void givenMessageWhenProperShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String actualResult = MoodAnalyser.analyseMood("User is Sad");
		Assert.assertEquals("Sad", actualResult);
	}
}