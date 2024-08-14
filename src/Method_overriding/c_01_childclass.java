package Method_overriding;

public class c_01_childclass extends c_01_parentclass{
	public void display()
	{
		System.out.println("This is child class display method");
	}
	public void show()
	{
		System.out.println("This is child class show method");
	}
	public static void main(String args[])
	{
		//child class reference and object
		c_01_childclass obj1=new c_01_childclass();
		obj1.display();
		obj1.show();
		//parent class reference and object
		c_01_parentclass obj2= new c_01_parentclass();
		obj2.display();
		obj2.show();
		//parent reference and child object
		c_01_parentclass obj3=new c_01_childclass();
		obj3.display();
		obj3.show();
	}
}
