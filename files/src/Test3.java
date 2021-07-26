import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;


/**
 * Note:
 * 1)When writing file, by default settings,previous data always get over-ridden
**/

public class Test3 {
    public static void main(String[] args) throws Exception {

        File f1 = new File("file1.txt");

        System.out.println("Previous data:");

        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);

        String stmp;

        while ( (stmp = br.readLine())!= null ) {
            System.out.println(stmp);
        }
        br.close();

        System.out.println("-----------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);
        String data;int n;
        data = sc.nextLine();
        n = sc.nextInt();

        FileWriter fw = new FileWriter(f1);
        BufferedWriter bw = new BufferedWriter(fw);

        for(int i = 0;i<n;i++) {
            bw.write(data+"\n");
        }
        bw.close();

        System.out.println("New data:");
        fr = new FileReader(f1);
        br = new BufferedReader(fr);


        while ( (stmp = br.readLine())!= null ) {
            System.out.println(stmp);
        }
        br.close();


    }
}
