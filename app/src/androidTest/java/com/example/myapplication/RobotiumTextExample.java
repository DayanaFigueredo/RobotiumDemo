package com.example.myapplication;

import android.support.test.InstrumentationRegistry;
import android.support.test.filters.SmallTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.Button;
import android.widget.TextView;

import com.robotium.solo.Solo;
import com.squareup.spoon.Spoon;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class RobotiumTextExample {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    private Solo solo;

    @Before
    public void setUp() {
        solo = new Solo(InstrumentationRegistry.getInstrumentation(),
                activityTestRule.getActivity());
    }

    @After
    public void tearDown() {
        solo.finishOpenedActivities();
    }

    private String result = "Undefined";

    private void test_body() {
        solo.unlockScreen();
        Button btn_test = (Button) solo.getView(R.id.btn_test);
        solo.waitForText("hello_world", 1, 2000);
        solo.clickOnView(btn_test);
        TextView tv = (TextView) solo.getView(R.id.main_tv);
        result = tv.getText().toString();
        Spoon.screenshot(solo.getCurrentActivity(), "Evidence");
    }

    @Test
    public void test_changeTextViewHello() {
        test_body();
        assertEquals("Hello", result);
    }

    @Test
    public void test_changeTextViewHi() {
        test_body();
        assertEquals("hi", result);
    }

}
