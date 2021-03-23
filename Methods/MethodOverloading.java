package gitposting;

public class MethodOverloading {
	
	
	static int f1(int a)
	{
		return a*10;
	}
	static int f1(int a,int b)
	{
		return a*10 + b*10;
	}
	/**
	static double f1(int a,int b)
	{
	   return a*10.0 + b*10.0;
	}
	This method will not work.Methods can only be over-loaded by bring variation in parameters
	**/
	static double f1(int a,int b,int c)
	{
		return a*10.0 + b*10.0;
	}
	static double f1(int a,double b)
	{
		return a*10.0 + b*10.0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
