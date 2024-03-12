package FormRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"C:\\Users\\SHUBHASHREE\\Documents\\Java_Programs\\.metadata\\cucumberjunit\\src\\test\\resources\\FORM\\form.feature"},
			glue = {"stepsdefination"}
			)

	public class FormRunner{
		
	}

