package com.first;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLogic {
	
	
	 @BeforeClass  
	    public static void setUpBeforeClass() throws Exception {  
	        System.out.println("before class");  
	    }  
	    @Before  
	    public void setUp() throws Exception {  
	        System.out.println("before");  
	    }  
	  

	@Test
	public void testFindMax(){
		System.out.println("in find max");
		assertEquals(5,Calculation.findMax(new int[]{1,4,3,5}));
		assertEquals(-1,Calculation.findMax(new int[]{-8,-6,-3,-1}));
	}
	
	@Test
	public void testReverse(){
		System.out.println("in reverse");

		assertEquals("ayirp",Calculation.reverse("priya"));

	}
	
	 @After  
	    public void tearDown() throws Exception {  
		 
	        System.out.println("after");  
	    }  
	  
	    @AfterClass  
	    public static void tearDownAfterClass() throws Exception {  
	        System.out.println("after class");  
	    }  
	  
	
	@Test
	public void testCube(){
		
		System.out.println("in cube");

		assertEquals(8,Calculation.cube(2));

	}
}
