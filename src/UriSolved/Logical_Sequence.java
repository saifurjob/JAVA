//URI 1144
package UriSolved;

import java.util.Scanner;

public class Logical_Sequence
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        for (int i = 1; i <= X; i++) 
        {
            for (int j = 1; j <= 2; j++) 
            {
                System.out.print(i +" ");
                if(j==1)
                {
                    for (int k = 1; k <= 2; k++) 
                    {
                        if(k==1)    System.out.print( i*i+" ");
                        else        System.out.print( (i*i*i));
                    }
                    System.out.println("");
                }
                else
                {
                    for (int k = 1; k <= 2; k++) 
                    {
                        if(k==1)    System.out.print( (i*i+1)+" ");
                        else        System.out.print( (i*i*i+1));
                    }
                    System.out.println("");
                    
                }
            }
        }
        
    }
}
