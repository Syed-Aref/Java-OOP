package sec1;


/**
 import java.util.*; --> Implicit import : imports all class & interface of util package
 import java.util.ArrayList; --> Explicit import : imports all class & interface of util package

 **/
// Objective: To use Pattern class (which is inside regx(pack),which is inside util(pack))

// import java.util.*; Wrong:It does not import the classes from regex sub package
// import java.util.regex.*; Correct : It imports all classes & interfaces from regex sub-package
import java.util.regex.Pattern; // Correct : It imports pattern class only(recommended)

public class ImportStatement {
    public static void main(String[] args) {

        // Fully qualified-name
        java.util.ArrayList<Integer> ali = new java.util.ArrayList();

        Pattern p = Pattern.compile("ah");

    }

}
