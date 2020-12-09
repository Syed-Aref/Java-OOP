package gitposting;

public class Method_Static_void {
	static void method1()
	{
		System.out.println("This is method1");
	}
	static void method2(String person)
	{
		System.out.println(person+" is in method2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Static_void msv = new Method_Static_void();
		
		msv.method1();
		msv.method2("Ahmed");
		// However, this is unecessary
		
		method1();
		method2("Ahmed");
		
	}
}
