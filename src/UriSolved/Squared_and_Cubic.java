//URI 1143
package UriSolved;

import java.util.Scanner;

public class Squared_and_Cubic
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) 
        {
            for (int j = 1; j <4; j++) 
            {
                switch(j)
                {
                    case 1:
                        System.out.print(i + " ");
                        break;
                    case 2:
                        System.out.print((i*i) + " ");
                        break;
                    case 3:
                        System.out.println((i*i*i));
                        break;
                }
            }
        }
    }
}
