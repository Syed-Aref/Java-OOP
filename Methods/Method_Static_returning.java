package gitposting;

public class Method_Static_returning {
	
	static int give100()
	{
		return 100;
	}
	static int div(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_NonStatic_returning msr = new Method_NonStatic_returning();
		
		System.out.println(msr.give100());
		System.out.println(msr.div(63,3));
		
		System.out.println(give100());
		System.out.println(div(63,3));
		
	}
}
