package stepDefinitions;


import io.cucumber.java.en.Given;
import org.testng.Assert;

public class StepDef1 {

    @Given("^Check first scenario$")
    public void test1(){
        System.out.println("Hello");
        Assert.assertEquals(1,2);

    }
}
