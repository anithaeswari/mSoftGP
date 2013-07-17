package cxfsample.service.CXF_Example;

public class TrialImpl implements Trial {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		return c;
	}

	@Override
	public boolean Ans(boolean a, boolean b) {
		// TODO Auto-generated method stub
		if(a==b)
		{
			System.out.println("passed");
			return true;
		}
		else
		{
			System.out.println("failed");
		
		return false;
		}
	}

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		double c=a+b;
		return c;
	}

	@Override
	public float tri_mul(float a) {
		// TODO Auto-generated method stub
		float ans=a*a*a;
		return ans;
	}

	@Override
	public int cube(int x) {
		// TODO Auto-generated method stub
		int cube=x*x*x;
		return cube;
	}

	@Override
	public char name(char n) {
		// TODO Auto-generated method stub
		return n;
	}

	@Override
	public int aryexample(int[] a) {
		// TODO Auto-generated method stub
		
		return 0;
	}

}
