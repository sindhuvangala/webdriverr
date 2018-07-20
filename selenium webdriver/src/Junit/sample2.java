package Junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class sample2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println( "hii..");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("bye...");}
   @Test
   public void test() {
		System.out.println("this is an apple");
	}
   @Test
   public void test1() {
	   System.out.println("this is junit");
	   
   }

}
