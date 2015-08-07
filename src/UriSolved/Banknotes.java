//URI 1018
package UriSolved;

import java.util.Scanner;

public class Banknotes
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(A);
        int a[] = {100, 50, 20, 10, 5, 2, 1};
        for (int i = 0; i < 7; i++) 
        {
            System.out.println(A/a[i]+" nota(s) de R$ "+a[i]+",00");
            A = A -(A/a[i]*a[i]);
        }
        
        
    }
}
