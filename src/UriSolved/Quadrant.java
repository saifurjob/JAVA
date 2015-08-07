//URI 1115
package UriSolved;

import java.util.Scanner;

public class Quadrant
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int X, Y;
      
        for (int i = 0; ; i++) 
        {
            X = sc.nextInt(); 
            Y = sc.nextInt(); 
            
            if(X==0 || Y==0)break;
            
            if(X>0 && Y>0)
            {
                System.out.println("primeiro");
            }
            else if(X>0 && Y<0)
            {
                System.out.println("quarto");
            }
            else if(X<0 && Y<0)
            {
                System.out.println("terceiro");
            }
            else if(X<0 && Y>0)
            {
                System.out.println("segundo");
            }
        }
    }
}
