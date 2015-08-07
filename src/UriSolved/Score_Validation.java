//URI 1117
package UriSolved;

import java.util.Scanner;

public class Score_Validation
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        double X;
        double XTotal=0;
        double count=0;
      
        for (int i = 0; ; i++) 
        {
            X = sc.nextDouble(); 
            
            if(X<0 || X>10)
            {
                System.out.println("nota invalida");
            }
            else
            {
                XTotal+=X;
                count++;
                if(count==2)break;
            }
        }
        
        System.out.printf("media = %.2f\n",XTotal/2);
    }
}
