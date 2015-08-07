//URI 1241
package UriSolved;

import java.util.Scanner;

public class Fit_or_Dont_Fit_II
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int caseNumber = sc.nextInt();
        int caseNum= 0;
        while(caseNum<caseNumber) 
        {
            String A, B;
            A =sc.next();
            B =sc.next();
            if(A.contains(B))
            {
                String tempStr = A.substring(A.length()-B.length(), A.length());
                
                if(tempStr.equalsIgnoreCase(B))
                    System.out.println("encaixa");
                else
                    System.out.println("nao encaixa");
            }
            else
                System.out.println("nao encaixa");
                
            caseNum++;
        }
        
    }
}
