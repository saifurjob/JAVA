//URI 1145
package UriSolved;

import java.util.Scanner;

public class Logical_Sequence_2
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        for (int i = 1; i <= Y; i++) 
        {
            if(i%X==0)
                System.out.println(i);
            else
                System.out.print(i+" ");
                
        }
    }
}
