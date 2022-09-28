import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int userInt = scnr.nextInt();
        double userDouble = scnr.nextDouble();
        char userChar = scnr.next().charAt(0);
        String userString = scnr.next();
        int value = (int)userDouble;

        System.out.println("Enter integer: ");
        //System.out.println("integer: "+userInt);

        System.out.println("Enter double: ");
        //System.out.println("Double: "+userDouble);

        System.out.println("Enter character: ");
        //System.out.println("Character "+userChar);

        System.out.println("Enter string: ");
        //System.out.println("String: "+userString);

         System.out.println(userInt+" "+userDouble+" "+userChar+" "+ userString);
         System.out.println(userString+" "+userChar+" "+userDouble+" "+userInt);
         System.out.println(userDouble+" cast to an integer is "+ value);


         

        return;
    }
}