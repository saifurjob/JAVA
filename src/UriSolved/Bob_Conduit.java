//URI 1589
package UriSolved;

import java.util.Scanner;

public class Bob_Conduit
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        
        for (int i = 0; i < caseNum; i++) 
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            System.out.println(a+b);
        }
    }
}
