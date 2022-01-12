package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.Cucumber;


//@RunWith(Cucumber.class)

//@RunWith(Cucumber.class)


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "D:\\Eclipse\\BDDTesting\\src\\test\\resources\\Feature\\xyz.feature",
		glue = {"StepDefinition"}
		
		)



public class TestRunner {
	
	

}
