//URI 1174
package UriSolved;

import java.util.Scanner;

public class Array_Selection_I
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        double A[] = new double[100];
        for (int i = 0; i < A.length; i++) 
        {
            A[i] = sc.nextDouble();
            if(A[i]<=10)
            {
                System.out.println("A["+i+"] = "+ A[i]);
            }
            
        }
    }
}
