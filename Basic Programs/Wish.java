class Wish //Class declaration
{
	static 
	{
		System.out.println("STATIC BLOCK");
	}
	Wish()//initialise the object and create the object
	{
		System.out.println("CONSTRUCTOR");
	}
	public static void display()//method Declaration
	{//Method Implementation
		System.out.println("METHOD/NON-STATIC/INSTANCE");
	}
	public static void main(String[] ar)
	{

		System.out.println("Static method");
		new Wish();//objection creation
		Wish.display();
	}
}









