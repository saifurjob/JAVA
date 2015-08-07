
package Java_Basic.Scanner_Class;

import java.util.Scanner;

public class Scanner_hasNext_next
{
    public static void main(String[] args) throws Exception
    {
        
        Scanner sc1 = new Scanner(System.in);
        sc1.useDelimiter(" ");
        
        while (sc1.hasNext()) 
        {
            System.out.println(sc1.next());
        }
    }
}
  