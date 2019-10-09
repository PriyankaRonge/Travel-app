package com.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1UnitTest {


	String msg="Hello mes";
	Demo2 demo= new Demo2(msg);
	
	@Test
	 public void testPrintMessage() {
	      assertEquals(msg,demo.printMesage());
	   }

}
