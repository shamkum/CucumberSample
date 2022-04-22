package com.org.testclass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="",dryRun=false,monochrome=true,plugin={"pretty","html:Report/html"})

public class RunnerClass {

}
