package gitposting;

public class Method_NonStatic_returning {
	
	int give100()
	{
		return 100;
	}
	int div(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_NonStatic_returning mnsr = new Method_NonStatic_returning();
		System.out.println(mnsr.give100());
		System.out.println(mnsr.div(63,3));
		
	}
}
