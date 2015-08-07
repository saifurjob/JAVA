//URI 1173
package UriSolved;

import java.util.Scanner;

public class Array_fill_I
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        int N[] = new int[10];
        int V = sc.nextInt();
        int mul;
        for (int i = 0; i < 10; i++) 
        {
            N[0]=V;
            if(i==0)
            {
                System.out.println("N["+i+"] = "+ N[i]);
            }
            
            else
            {
                mul=N[i-1]*2;
                N[i] =mul; 
                System.out.println("N["+i+"] = "+ N[i]);
            }
        }
    }
}
