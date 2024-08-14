package Method_overloading;

public class testmethod2 {
	static void add(int a,double d)
	{
		System.out.println("Argument type(int double)");
	}
	static void add(double d, int a)
	{
		System.out.println("Argument type(double int)");
	}
	static void add(double a,float f)
	{
		System.out.println("Argument type(double float)");
	}
	static void add(float a,int d)
	{
		System.out.println("Argument type(float int)");
	}
	public static void main(String args[])
	{
		add(10,20.0);
		add(10.0,12);
		add(12.0,7.7f);
		add(7.8f,5);
	}
	
}
