
package Java_Basic.Scanner_Class;

import java.util.Scanner;

public class Delimeter_with_Scanner
{ 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner("saifur:rahman:is:a:student:of:cse");
        sc.useDelimiter(" ");
        sc.useDelimiter(":");
        while (sc.hasNext()) 
        {
            System.out.println(sc.next());
        }
    }
}
