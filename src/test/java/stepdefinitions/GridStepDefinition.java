package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.GridBase;

public class GridStepDefinition extends GridBase{

    AmazonPage amazonPage = new AmazonPage();

    WebDriver driver;


}
