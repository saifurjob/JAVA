//URI 1118
package UriSolved;

import java.util.Scanner;

public class Several_Scores_with_Validation
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        int X , count =0; 
        double Y ;
        
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; ; j++) 
            {
                double YTotal=0;
                Y = sc.nextDouble();
                if((double)Y<0.0 || (double)Y>10.0)
                {
                    System.out.println("nota invalida");
                }
                else
                {
                    YTotal+=Y;
                    count++;
                }
                
                if(count==2)
                {
                    double media = YTotal/2;
                        System.out.printf("media = %.2f", media);
                    
                    X = sc.nextInt();
                    if(X==1)
                    {
                        System.out.println("novo calculo (1-sim 2-nao)");
                        break;
                    }

                    if(X<1 || X>2)
                        System.out.println("novo calculo (1-sim 2-nao)");

                    if(X==2)
                    {
                        System.out.println("novo calculo (1-sim 2-nao)");
                        break;
                    }
                }
            }
            
        }
    }
                
}
