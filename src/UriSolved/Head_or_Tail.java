//URI 1329
package UriSolved;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Head_or_Tail
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) 
            {                
                int cases = sc.nextInt();
                if(cases == 0)  break;
                int x = 0, y = 0;
                for (int i = 0; i < cases; i++) 
                {
                    int a = sc.nextInt();
                    if(a==0)
                        x++;
                    else if(a==1)
                        y++;
                }
                System.out.println("Mary won "+x+" times and John won "+y+" times");
            }
            
        } catch (InputMismatchException e) {
        }
    }
}
