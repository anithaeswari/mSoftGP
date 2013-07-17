package cxfsample.service.CXF_Example;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.jws.WebService;

@WebService
public interface ArithmeticCalculator {
 
    int add(int a,int b);
    int sub(int a,int b);
    int multiply(int a,int b);
    int division(int a,int b);
    String Concatenation(String name1,String name2);
    String Hello(String name);
    String callMethod(Object object);
    double add(double a,double b);
    float  mul(float a,float b);
    String get(List list);
    short display(short a);
    String MapTest(Map map);
    int SetTest(Set set);
    String collection(Collection collection);
    char name(char n);
    String trf(boolean n);
    String eqdouble(double num);
    int eqint(int n);
    float eqfloat(float f);
    String verifytest(String name);
    void testing();
}

