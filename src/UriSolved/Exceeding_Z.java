//URI 1150
package UriSolved;

import java.util.Scanner;

public class Exceeding_Z
{
    public static void main(String[] args) throws Exception
    {
        
        Scanner sc = new Scanner(System.in);
        int X , Z = 0;
        int count=1;
        
        X = sc.nextInt();
        while((Z = sc.nextInt())<=X)
        {
            
        }
        while (true) 
        {           
            count++;
            if (X>Z) 
            {
                System.out.println(count);
                break;
            }
            X=X+X+1;
        }
    }
}
