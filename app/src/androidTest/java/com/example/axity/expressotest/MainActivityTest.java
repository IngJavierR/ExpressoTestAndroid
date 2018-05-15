package com.example.axity.expressotest;

import android.content.ComponentName;
import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getTargetContext;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by javierrodriguez on 5/14/18.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateLoginOk() {

        Intents.init();

        onView(withId(R.id.et_input_username))
                .perform(typeText("Javier"));

        onView(withId(R.id.et_input_pwd))
                .perform(typeText("Axity"));

        onView(withId(R.id.btn_message))
                .perform(click());

        //onView(withId(R.id.tv_status_message))
          //      .check(matches(withText("Login valido")));
        intended(hasComponent(WelcomeActivity.class.getName()));

        Intents.release();
    }

    @Test
    public void validateLoginIncorrect() {

        onView(withId(R.id.et_input_username))
                .perform(typeText("Javier"));

        onView(withId(R.id.et_input_pwd))
                .perform(typeText("Intellego"));

        onView(withId(R.id.btn_message))
                .perform(click());

        onView(withId(R.id.tv_status_message))
                .check(matches(withText("Login incorrecto")));
    }
}
