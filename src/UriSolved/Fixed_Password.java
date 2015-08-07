//URI 1114
package UriSolved;
import java.util.Scanner;

public class Fixed_Password
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int X;
      
        for (int i = 0; ; i++) 
        {
            X = sc.nextInt(); 
            
            if(X!=2002)
            {
                System.out.println("Senha Invalida");
            }
            else if(X==2002)
            {
                System.out.println("Acesso Permitido");
                break;
            }
        }
    }
}
