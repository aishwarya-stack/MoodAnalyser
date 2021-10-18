package com.bridgelabz.moodanalyser;

import org.junit.Test;

import junit.framework.Assert;

public class MoodAnalyserTest {
// Test case to analyze sad mood of the user

	@Test
	public void givenMessageWhenProperShouldReturnSad() {
        MoodAnalyser moodanalyser = new MoodAnalyser("I am in Sad Mood");
        String actualResult = moodanalyser.analyseMood();
        Assert.assertEquals("Sad", actualResult);
    }
	@Test
    public void givenMessageWhenProperShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser("I am in happy Mood");
        String actualResult = moodanalyser.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }
	
}
