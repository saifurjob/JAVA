
package Java_Basic.Scanner_Class;

import java.io.File;
import java.util.Scanner;

public class File_with_Scanner
{
    public static void main(String[] args) throws Exception
    {
//        File file = new File("info.ini");
//        Scanner sc = new Scanner(file);
        
        Scanner sc = new Scanner(new File("info.ini"));
        
        while (sc.hasNextLine()) 
        {
            System.out.println(sc.nextLine());
        }
    }
}
  