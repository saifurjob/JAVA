//URI 1116
package UriSolved;

import java.util.Scanner;

public class Dividing_X_by_Y
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        
        double X, Y;
      
        for (int i = 0; i< caseNum; i++) 
        {
            X = sc.nextInt(); 
            Y = sc.nextInt(); 
            
            
            if(Y==0)
            {
                System.out.println("divisao impossivel");
            }
            else
            {
                System.out.printf("%.1f\n",X/Y);
            }
        }
    }
}
