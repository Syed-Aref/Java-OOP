package uderstandingsubsuper;
public class SubSuper_Main {
	public static void main(String[] args) 
	{
		SubClassForMrthodSqr sqr = new SubClassForMrthodSqr();
		SubClassForMrthodCub cub = new SubClassForMrthodCub();
		System.out.println(cub.methodAdd(7,8));
		System.out.println(cub.MethodCub(7));
		System.out.println(sqr.methodAdd(9,10));
		System.out.println(sqr.MethodSqr(9));
	}	
}
