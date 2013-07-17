package cxfsample.service.CXF_Example;

import javax.jws.WebService;

@WebService
public interface ArithmeticCalculator {
 
    int add(int a,int b);
    int sub(int a,int b);
    int multiply(int a,int b);
    int division(int a,int b);
}

