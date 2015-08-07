//URI 1155
package UriSolved;

import java.util.Scanner;

public class S_Sequence
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        double num;
        double S = 0;
        for (int i = 1; i<=100; i++) 
        {
            S += 1/(double)i;
        }
        
        System.out.printf("%.2f\n",S);
    }
}
