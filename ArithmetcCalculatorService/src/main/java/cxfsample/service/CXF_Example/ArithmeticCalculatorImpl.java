
package cxfsample.service.CXF_Example;

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
}

