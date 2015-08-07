//URI 1175
package UriSolved;

import java.util.Scanner;

public class Array_change_I
{
    public static void main(String[] args) throws Exception
    {
        int N[] = new int[3];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < N.length; i++) 
        {
            N[i] = sc.nextInt();
        }
        
        for (int i = N.length-1, j = 0; i >=0 ; i--, j++) 
        {
            System.out.println("N["+j+"] = "+N[i]);
        }
    }
}
