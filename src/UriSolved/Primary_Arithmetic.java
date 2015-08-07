//URI 1212
package UriSolved;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Primary_Arithmetic
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        try {
            int a, b;
            while (true) 
            {                
                a = sc.nextInt();
                b = sc.nextInt();
                if(a==0 && b==0)    break;
                String s1 = a+"";
                String s2 = b+"";
                String sMin = "";
                String sMax = "";
                if(s1.length()<=s2.length())
                {
                    sMin = s1;
                    sMax = s2;
                }
                else
                {
                    sMax = s1;
                    sMin = s2;
                }
                    
            }
        } catch (InputMismatchException e) {
        }
    }
}
