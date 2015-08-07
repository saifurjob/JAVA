//URI 1113
package UriSolved;
import java.util.Scanner;

public class Ascending_and_Descending
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        

        int X, Y;
        for (int i = 0; ; i++) 
        {
            X = sc.nextInt(); 
            Y = sc.nextInt(); 
            
            if(X==Y)break;
            if(X<Y)
            {
                System.out.println("Crescente");
            }
            else if(X>Y)
            {
                System.out.println("Decrescente");
            }
            
        }
        
        
    }
}
