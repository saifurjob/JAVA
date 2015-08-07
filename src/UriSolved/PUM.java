//URI 1142
package UriSolved;

import java.util.Scanner;

public class PUM
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for (int i = 0; i < num; i++) 
        {
            for (int j = 1; j <=4; j++) 
            {
                if(j == 4)
                {
                    System.out.println("PUM");
                    break;
                }
                System.out.print((j+i*4)+" ");
            }
        }
    }
}
