
package cxfsample.service.CXF_Example;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.jws.WebService;

@WebService(endpointInterface = "cxfsample.service.CXF_Example.ArithmeticCalculator")
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

  
	
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}


	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}


	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	
	public int division(int a, int b) {
		// TODO Auto-generated method stub
	return a/b;
	}


	@Override
	public String Concatenation(String name1, String name2) {
		// TODO Auto-generated method stub
		String result=name1+name2;
		return result;
	}


	@Override
	public String Hello(String name) {
		// TODO Auto-generated method stub
		return "Hello"+name;
	}


	@Override
	public String callMethod(Object object) {
		// TODO Auto-generated method stub
	return object.getClass().getSimpleName().toString();
	}


	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		double c=a+b;
		return c;
	}


	@Override
	public float mul(float a, float b) {
		// TODO Auto-generated method stub
		float c=a*b;
		return c;
	}


	@Override
	public String get(List list) {
		// TODO Auto-generated method stub
	//System.out.println(list.get(0));
	return list.get(0).toString();
		
	}


	@Override
	public short display(short a) {
		// TODO Auto-generated method stub
		return a;
	}


	@Override
	public String MapTest(Map map) {
		// TODO Auto-generated method stub
		
		return map.get(0).toString();
	}


	@Override
	public int SetTest(Set set) {
		// TODO Auto-generated method stub
		return set.size();
	}


	@Override
	public String collection(Collection collection) {
		// TODO Auto-generated method stub
		
		return collection.toString();
	}


	@Override
	public char name(char n) {
		// TODO Auto-generated method stub
		return n;
	}


	@Override
	public String trf(boolean n) {
		// TODO Auto-generated method stub
		String status;
		if (n==true)
			
			status="passed";
			
		else
			status="fail";
		return status;
	}


	@Override
	public String eqdouble(double num) {
		// TODO Auto-generated method stub
		return "two"+"."+"sixtyfive";
	}


	@Override
	public int eqint(int n) {
		// TODO Auto-generated method stub
		
		return n;
	}


	@Override
	public float eqfloat(float f) {
		// TODO Auto-generated method stub
		return f;
	}


	@Override
	public String verifytest(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void testing() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Void Method");
	}


	

	


	
}

