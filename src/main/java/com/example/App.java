package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();

        // Open SauceDemo website
        driver.get("https://www.saucedemo.com/");

        // Maximize window
        driver.manage().window().maximize();

        // Enter login details
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click login button
        driver.findElement(By.id("login-button")).click();
        
        // Close the browser
        driver.quit();
    }
}

