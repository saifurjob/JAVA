//URI 1177
package UriSolved;

import java.util.Scanner;

public class Array_fill_II
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        int N[] = new int[1000];
        int T = sc.nextInt();
        int mul;
        for (int i = 0; i < N.length; i++) 
        {
            N[i] = i%T; 
            System.out.println("N["+i+"] = "+ N[i]);
        }
    }
}
