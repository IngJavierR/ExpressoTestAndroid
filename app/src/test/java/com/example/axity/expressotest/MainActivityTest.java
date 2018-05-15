package com.example.axity.expressotest;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by javierrodriguez on 5/15/18.
 */

public class MainActivityTest {

    @Test
    public void validateLoginOk() {
        MainActivity mainActivity = new MainActivity();
        boolean result = mainActivity.validateUser("Javier", "Axity");
        Assert.assertTrue(result);

    }

    @Test
    public void validateLoginIncorrect() {
        MainActivity mainActivity = new MainActivity();
        boolean result = mainActivity.validateUser("Javier", "Intellego");
        Assert.assertFalse(result);

    }
}
