package gitposting;

class Info
{
	public String name;
	public int id , sec;
	public Info(String name,int id,int sec)
	{
		this.name = name;
		this.id = id;
		this.sec = sec;
	}
	public String toString()
	{
		return "Name : "+this.name+" , "+"Id : "+this.id+" , "+"Section : "+this.sec;
	}
}

public class InfoClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info i1 = new Info("Hasan",20,02);
		Info i2 = i1;
		Info i3 = i2;
		
		i2 = null;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);

	}
}
