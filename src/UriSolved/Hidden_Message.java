//URI 1272
package UriSolved;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Hidden_Message
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int caseNum  = Integer.parseInt(sc.nextLine());
        int cases = 0;
        
        try 
        {
            while (true) 
            {                
                if (cases >= caseNum)  break;
                String s = "";
                while (true) 
                {      
                    s += sc.next();
                }

//                String[] s1 = s.split(" ");
//                
//                for (String words : s1) 
//                {
//                    words = words.trim();
//                    System.out.print(words.charAt(0));
//                }
//                System.out.println();
                
//                cases++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
    }
}
