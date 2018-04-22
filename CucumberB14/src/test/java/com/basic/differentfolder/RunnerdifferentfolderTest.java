package com.basic.differentfolder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		monochrome=true,//encoding use to remove garbage value into console result
		//dryRun=true,// check the definition file method is same like feature file
		features= ("src/test/resources/com/basic/differentfolderFF/"),//feature file path start from src
		glue=("com/basic/differentfolder") //java file path start from com 


)
public class RunnerdifferentfolderTest {
	
	
	
		
}
