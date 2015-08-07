//URI 1065		
package UriSolved;

import java.util.Scanner;

public class Valores
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        int posCount = 0;
        int negCount = 0;
        int num;
        for (int i = 0; i < 5; i++) 
        {
            
            num = sc.nextInt();
            if(num%2==0)
                evenCount++;
            else 
                oddCount++;
            if(num>0)
                posCount++;
            else if(num<0)
                negCount++;
        }
        System.out.println(evenCount+" valor(es) par(es)");
        System.out.println(oddCount+" valor(es) impar(es)");
        System.out.println(posCount+" valor(es) positivo(s)");
        System.out.println(negCount+" valor(es) negativo(s)");
    }
}
