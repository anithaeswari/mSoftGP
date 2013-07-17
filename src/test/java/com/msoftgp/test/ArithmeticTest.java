package com.msoftgp.test;

import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyChar;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Matchers.anyFloat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import cxfsample.service.CXF_Example.ArithmeticCalculatorImpl;
@RunWith(MockitoJUnitRunner.class)

public class ArithmeticTest{
	@Test
	public void result()
	{
	
	ArithmeticCalculatorImpl arithmetic=mock(ArithmeticCalculatorImpl.class);
	
	//when with default
	when(arithmetic.add(2, 3)).thenReturn(6);
	System.out.println("Returning Defult Integer:"+arithmetic.add(2, 3));
	
	//when with callReal method
	when(arithmetic.add(5, 6)).thenCallRealMethod();
	System.out.println("Calling Real Method:"+arithmetic.add(5, 6));
	
	//when with Exception
	/*when(arithmetic.division(4, 0)).thenThrow(new IllegalArgumentException());
	System.out.println("Runtime Exception:"+arithmetic.division(4, 0));*/
	
	//when with Answer
	when(arithmetic.multiply(6, 6)).thenAnswer(new Answer<Integer>()
			{

				@Override
				public Integer answer(InvocationOnMock invocation)
						throws Throwable {
					// TODO Auto-generated method stub
					int a=(Integer) invocation.getArguments()[0];
					int b=(Integer)invocation.getArguments()[1];
					int c=a/b;
					return c;
				}
		
			});
	
	System.out.println("When with Answer"+arithmetic.multiply(6, 6));
	
	//anyInt
	when(arithmetic.sub(anyInt(), anyInt())).thenReturn(100);
	System.out.println(arithmetic.sub(78, 105));
	
	//anyFloat
	when(arithmetic.eqfloat(anyFloat())).thenCallRealMethod();
	System.out.println(arithmetic.eqfloat(1.2f));

	//anyChar
	when(arithmetic.name(anyChar())).thenCallRealMethod();
	System.out.println(arithmetic.name('b'));
	
	//anyDouble
	when(arithmetic.add(anyDouble(), anyDouble())).thenCallRealMethod();
	System.out.println(arithmetic.add(7.56, 3.42));
	
	//anyString
	when(arithmetic.Concatenation(anyString(),anyString())).thenReturn("SUCCESS");
	System.out.println(arithmetic.Concatenation("Anitha", "Testing"));
	
	//anyBoolean
	when(arithmetic.trf(anyBoolean())).thenCallRealMethod();
	System.out.println(arithmetic.trf(false));
	
	//then Return
	when(arithmetic.division(anyInt(), anyInt())).thenReturn(1,2,3,4);
	System.out.println("First Time:"+arithmetic.division(12, 6));
	System.out.println("Second Time:"+arithmetic.division(20, 5));
	System.out.println("Third Time:"+arithmetic.division(20, 5));
	System.out.println("Fourth Time:"+arithmetic.division(20, 5));
	
	//AnyList
	List list=new LinkedList();
	list.add("one");
	list.add("two");
	when(arithmetic.get(anyList())).thenCallRealMethod();
	System.out.println(arithmetic.get(list));
	
	//anySet
	Set myset=new HashSet();
	myset.add("apple");
	myset.add("orange");
	when(arithmetic.SetTest(anySet())).thenCallRealMethod();
	System.out.println(arithmetic.SetTest(myset));
	
	//anyMap
	Map mymap=new HashMap();
	mymap.put(0,"first");
	mymap.put(1, "second");
	when(arithmetic.MapTest(anyMap())).thenCallRealMethod();
	System.out.println(arithmetic.MapTest(mymap));
	
	
	}	
}