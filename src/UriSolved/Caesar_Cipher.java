//URI 1253
package UriSolved;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Caesar_Cipher
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s1;
        
        for (int i = 0; i < N; i++) 
        {
            try 
            {
                s1 = sc.next();
                int shiftNum = sc.nextInt();
                
                for (int j = 0; j < s1.length(); j++) 
                {
                    if((s1.charAt(j)-shiftNum)< 'A')
                        System.out.printf("%c", 91-(shiftNum-(s1.charAt(j)-'A')));
                    else
                        System.out.printf("%c", (s1.charAt(j)-shiftNum));
                }
                System.out.println();
            } 
            catch (InputMismatchException e) 
            {
                
            }
        }
    }
}
