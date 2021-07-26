import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        // When working on Diretory or to create new file in a specific pth,give full path(absolute)
        File dirName = new File("F:\\Main IJ\\javaFiles\\src");
        if(dirName.isDirectory()) {
            System.out.println(dirName + " is directory");

            String[] farr = dirName.list();

            for(String s : farr){
                File ftmp = new File(dirName +"\\"+s);
                System.out.print(s + " : ");
                if( ftmp.exists() == false ){
                    System.out.println("does not exist");
                }
                else {
                    if( ftmp.isDirectory() ) System.out.println("is directory");
                    else System.out.println("is file");
                }


            }
        }
        else System.out.println(dirName + " is not directory");

        /** -------------------------------------------- */
        File f1 = new File("Test3");
        File f2 = new File("Test3.java");
        System.out.println(f1.exists() + " "+f2.exists());


    }
}
