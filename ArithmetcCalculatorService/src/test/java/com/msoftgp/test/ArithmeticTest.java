//Anitha's changes 1234
package com.msoftgp.test;

import junit.framework.Assert;

import org.junit.Test;

import cxfsample.service.CXF_Example.ArithmeticCalculatorImpl;

public class ArithmeticTest{
	@Test
	public void result()
	{
		ArithmeticCalculatorImpl a=new ArithmeticCalculatorImpl();
		int add_result=a.add(8, 10);
		System.out.println("Addition"+add_result);
		Assert.assertEquals(18, add_result);
		int sub_result=a.sub(18, 10);
		System.out.println("Subtraction:"+sub_result);
		Assert.assertEquals(8,sub_result);
		int mul_result=a.multiply(10, 2);
		System.out.println("Multiplication:"+mul_result);
		Assert.assertEquals(20, mul_result);
		int div_result=a.division(20, 5);
		System.out.println("Division:"+div_result);
		Assert.assertEquals(4, div_result);
		System.out.println("passed");
	}
	
}
