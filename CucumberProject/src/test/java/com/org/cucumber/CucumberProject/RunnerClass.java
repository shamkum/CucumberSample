package com.org.cucumber.CucumberProject;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="",dryRun=true,monochrome=true,plugin={"pretty","html:Report/html"})
public class RunnerClass {

}
