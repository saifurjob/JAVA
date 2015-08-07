
package Java_Basic.Scanner_Class;

import java.io.File;
import java.util.Scanner;

public class Scanner_hasNext_next_file
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc1 = new Scanner(new File("info.ini"));
        
        while (sc1.hasNextLine()) 
        {
            System.out.println(sc1.nextLine().trim());
        }
    }
}
  