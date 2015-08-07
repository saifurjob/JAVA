//URI 1120
package UriSolved;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Contract_Revision_2
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        try 
        {
            while (true) 
            {      
                int a, b;
                a = sc.nextInt();
                b = sc.nextInt();
                if(a==0 && b==0)    break;
                
                System.out.println(a+" = "+((a+"").matches("5")));
            }
        } catch (NoSuchElementException e) {
        }
            
    }
}
