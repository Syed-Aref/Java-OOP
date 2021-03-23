package gitposting;

class Info
{
	public String name;
	public int id , sec;
	public Info(String name,int id,int sec)
	{
		this.name = name; // this refrers to variables that belong to class Info
		this.id = id;S
		this.sec = sec;
	}
	public String toString() 
	{
		return "Name : "+this.name+" , "+"Id : "+this.id+" , "+"Section : "+this.sec;
	}
	// Normally , S.o.pln(info_var) prints memory location of info_var
	// Now,it will print the string that returned in line 15
}

public class SimpleClassExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info i1 = new Info("Hasan",20,02); // Creating new instance
		Info i2 = i1;
		Info i3 = i2;
		
		i2 = null; // Nullyfying i2 , however i1 and i3 are not affected
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);

	}
}
