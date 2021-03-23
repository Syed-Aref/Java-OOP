package understandingsetgetmethod;

public class SetGet {
	String courseName;
	void setCourseName(String s) 
	{
		courseName = s;
	}
	String getCourseName() 
	{
		return courseName;
	}
	void displayCourseName() 
	{
		System.out.println(getCourseName() + " is your course");
	}
	
}
