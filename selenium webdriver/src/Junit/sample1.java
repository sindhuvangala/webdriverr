package Junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class sample1 {

	@Before
	public void setUp() throws Exception {
		System.out.println("hi....");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("bye...");
	}

	@Test
	public void test() {
		System.out.println( "this is junit");
	}

}
