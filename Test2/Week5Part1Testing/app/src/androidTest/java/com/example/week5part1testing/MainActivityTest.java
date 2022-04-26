package com.example.week5part1testing;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    private String userInput = "James";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testUserInputScenario() {
        // input some text in the edit
        Espresso.onView(withId(R.id.editTextToChange)).perform(typeText(userInput));

        // close the soft keyboard
        Espresso.closeSoftKeyboard();

        // perform button click
        Espresso.onView(withId(R.id.btnChange)).perform(click());

        // checking the text in the textview
        Espresso.onView(withId(R.id.textViewChangedText)).check(matches(withText(userInput)));
    }

    @After
    public void tearDown() throws Exception {
    }
}