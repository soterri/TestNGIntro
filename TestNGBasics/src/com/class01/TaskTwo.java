package com.class01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TaskTwo {

	@BeforeClass
	public void johnSingle() {
		System.out.println("His life sucked before me");
	}
	@AfterClass
	public void johnTaken() {
		System.out.println("His life has become great bc of me");
	}
	@BeforeMethod
	public void johnCute() {
		System.out.println("Before me John was ugly");
	}
	@AfterMethod
	public void johnCute2() {
		System.out.println("He not ugly no more");
	}
	@Test
	public void kids() {
		System.out.println("We did not have kids");
	}
	@Test
	public void kids1() {
		System.out.println("Now we have kids");
	}
}
