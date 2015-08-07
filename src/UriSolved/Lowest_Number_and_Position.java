//URI 1180
package UriSolved;

import java.util.Scanner;

public class Lowest_Number_and_Position
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        
        int a[] = new int[numbers];
        
        for (int i = 0; i < a.length; i++) 
        {
            a[i] = sc.nextInt();
        }
        int min = a[0], count = 0;
        for (int i = 0; i < a.length; i++) 
        {
            if(min>a[i])
            {
                min = a[i];
                count = i;
            }
        }
        
        System.out.printf("Menor valor: %d\n", min);
        System.out.printf("Posicao: %d\n", count);
        
    }
}