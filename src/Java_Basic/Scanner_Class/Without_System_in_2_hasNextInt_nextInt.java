
package Java_Basic.Scanner_Class;

import java.util.Scanner;

public class Without_System_in_2_hasNextInt_nextInt
{ 
    public static void main(String[] args) 
    {
        String str = "1 2 3 4 5 6 7 8 9";
        
        Scanner sc = new Scanner(str);
        while (sc.hasNextInt()) 
        {
            System.out.println(" "+sc.nextInt()+1);
        }
    }
}
