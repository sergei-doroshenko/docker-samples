package org.sdoroshenko;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/ctofservice")
public class SeleniumResource {
    @GET
    @Produces("application/xml")
    public String convertCtoF() {

        Double fahrenheit;
        Double celsius = 36.8;
        fahrenheit = ((celsius * 9) / 5) + 32;

        String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
        return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
    }

    @Path("{c}")
    @GET
    @Produces("application/xml")
    public String convertCtoFfromInput(@PathParam("c") Double c) {
        Double fahrenheit;
        Double celsius = c;
        fahrenheit = ((celsius * 9) / 5) + 32;

        String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
        return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>" + "</ctofservice>";
    }

    @Path("/selenium")
    @GET
    public void runSelenium() {
        String chromePath = "/opt/google/chrome/google-chrome";
        System.setProperty("webdriver.chrome.driver", chromePath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--hide-scrollbars");
        options.addArguments("--no-sandbox");
        System.out.println(options);
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://test.com/");
        driver.close();
    }
}
