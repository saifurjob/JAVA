
package Java_Basic.Scanner_Class;

import java.util.Scanner;

public class Without_using_System_in_2_hasNext
{
    public static void main(String[] args) 
    {
        String str = "Hello world";
        
        Scanner sc = new Scanner(str);
        while (sc.hasNext()) 
        {
            System.out.println(sc.next());
        }
    }
}
