package com.example.ankurbaranwal.apnichoice;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> obj = new ActivityTestRule<LoginActivity>(LoginActivity.class);
    private LoginActivity loginActivity = null;
    @Before
    public void setUp() throws Exception
    {
        loginActivity = obj.getActivity();
    }

    @Test
    public void testLaunch()
    {
        View v = loginActivity.findViewById(R.id.login_phone_number_input);
        //check whether view is loaded or not
        assertNotNull(v);
    }

    @After
    public void tearDown() throws Exception
    {
        loginActivity = null;

    }
}