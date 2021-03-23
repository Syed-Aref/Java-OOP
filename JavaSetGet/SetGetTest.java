package understandingsetgetmethod;
import java.util.Scanner;
public class SetGetTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		SetGet sg = new SetGet();
		System.out.println(sg.getCourseName());
		sg.setCourseName(s);
		sg.displayCourseName();
	}
}
