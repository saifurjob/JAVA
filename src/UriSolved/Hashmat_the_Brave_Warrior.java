//URI 1198
package UriSolved;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Hashmat_the_Brave_Warrior
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        try 
        {
            while (true) 
            {                
                long a  = sc.nextLong();
                long b  = sc.nextLong();
                System.out.println(Math.abs(a-b));
            }
        } catch (NoSuchElementException e) {
        }
    }
}
