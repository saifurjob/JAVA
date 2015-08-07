//URI 1050		
package UriSolved;

import java.util.Scanner;

public class DDD
{
    public static void main(String[] args) throws Exception
    {
        int ddd[] = {61, 71, 11, 21, 32, 19, 27, 31};
        String destination[] = {"Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas", "Vitoria", "Belo Horizonte"};
    
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < ddd.length; i++) 
        {
            if(a==ddd[i])
            {
                System.out.println(destination[i]);
                break;
            }
            else if (i==ddd.length-1 && a!=ddd[i])
            {
                System.out.println("DDD nao cadastrado");
                break;
            }
        }

    }
    
}
