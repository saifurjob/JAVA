
package Java_Basic.Scanner_Class;

import java.io.File;
import java.util.Scanner;

public class File_with_Scanner_split
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("inf.ini"));

        while (sc.hasNextLine()) 
        {
            while (sc.hasNext()) 
            {
                String n = sc.next();
                String[] split = n.split(" ");
                System.out.println(n);
            }
            
        }
    }
}
  