//URI 1134
package UriSolved;

import java.util.Scanner;

public class Type_of_Fuel
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int X;
        int min = 0, max = 0;
        int Alcool=0, Gasolina=0, Diesel=0;
        
        while ((X = sc.nextInt())!=4) 
        {            
            if(X==1)Alcool++;
            else if(X==2)Gasolina++;
            else if(X==3)Diesel++;
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+Alcool);
        System.out.println("Gasolina: "+Gasolina);
        System.out.println("Diesel: "+Diesel);
    }
}
