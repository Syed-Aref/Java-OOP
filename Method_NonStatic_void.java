package gitposting;

public class Method_NonStatic_void {
	void method1()
	{
		System.out.println("This is method1");
	}
	void method2(String person)
	{
		System.out.println(person+" is in method2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_NonStatic_void mnsv = new Method_NonStatic_void();
		mnsv.method1();
		mnsv.method2("Aref");
	}
}
