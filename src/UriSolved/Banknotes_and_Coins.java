//URI 1018
package UriSolved;

import java.util.Scanner;

public class Banknotes_and_Coins
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        
        System.out.println("NOTAS:");
        double a[] = {100.00, 50.00, 20.00, 10.00,5.00,2.00};
        String a1[] = {"100.00", "50.00", "20.00", "10.00","5.00","2.00"};
        int notesA;
        for (int i = 0; i < 6; i++) 
        {
            notesA = (int) (A/a[i]);
            System.out.println(notesA+" nota(s) de R$ "+ a1[i]);
            A = A %a[i];
        }
        
        System.out.println("MOEDAS:");
        double b[] = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        String b1[] = {"1.00", "0.50", "0.25", "0.10", "0.05", "0.01"};
        for (int i = 0; i < 6; i++) 
        {
            notesA = (int) (A/b[i]);
            System.out.println(notesA+" moeda(s) de R$ "+ b1[i]);
            A = A %b[i];
        }
    }
}
