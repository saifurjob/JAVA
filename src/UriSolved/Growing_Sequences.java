//URI 1146
package UriSolved;

import java.util.Scanner;

public class Growing_Sequences
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int X ;
            
        while((X = sc.nextInt())!=0)
        {
            for (int i = 1; i <=X; i++) 
            {
                if(i==X)
                    System.out.println((i));
                else
                    System.out.print(i + " ");
                    
            }
        }
    }
}
