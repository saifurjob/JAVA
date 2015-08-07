//URI 1172
package UriSolved;

import java.util.Scanner;

public class Array_Replacement_I
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
 
        int X[] = new int[10];
        for (int i = 0; i < 10; i++) 
        {
            X[i]  = sc.nextInt();
             
            if(X[i]<=0)
                System.out.println("X["+i+"] = "+ 1);
            else
                System.out.println("X["+i+"] = "+ X[i]);
        }
         
    }
}
