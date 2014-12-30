package com.example.garry.bonteng;

import android.test.AndroidTestCase;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Created by garry on 12/30/14.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty","html:target/cucumber"}
        ,features = "resources"


)

public class CukesRunnerTest
{

     public void xTest() {

     }

}
