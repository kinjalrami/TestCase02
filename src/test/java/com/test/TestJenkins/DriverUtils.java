/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.TestJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author RANGANI2
 */
public class DriverUtils {
   public static WebDriver getChromeDriver() {//web driver is interface
        //setup chrome
        System.setProperty("webdriver.chrome.driver", "C:\\data\\chromedriver.exe");//(type,value)
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        return new ChromeDriver(capabilities);//chrome driver implements webdriver

    }

    public static void main(String[] args) {
        getChromeDriver();

    }  
}
