//URI 1154
package UriSolved;

import java.util.InputMismatchException;
import java.util.Scanner;

public class To_Carry_or_not_to_Carry
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        try 
        {
            while (true) 
            {                
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(a^b);
            }
        } catch (InputMismatchException e) {
        }
    }
}
