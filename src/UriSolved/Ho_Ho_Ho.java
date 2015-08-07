//URI 1759
package UriSolved;

import java.util.Scanner;

public class Ho_Ho_Ho
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        
        for (int i = 0; i < caseNum; i++) 
        {
            if(i==caseNum-1)
                System.out.println("Ho!");
            else     
                System.out.print("Ho ");
                
        }
    }
}
