package com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\Md Shamibur Rahman\\eclipse-workspace\\FacebookLogin\\facebook.feature"},
        glue = {"com\\test"},
        //tags = {"-@smoke"}, 
        dryRun = true, 
        format = {"pretty","html:report", "json:reportjson/cucumber.json"} )

public class Runner {

}
