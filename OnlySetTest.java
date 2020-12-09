package understandingsetgetmethod;
import java.util.Scanner;
public class OnlySetTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		OnlySet sg = new OnlySet();
		System.out.println(sg.courseName);
		sg.setCourseName(s);
		sg.displayCourseName();
	}
}
