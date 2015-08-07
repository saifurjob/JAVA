//URI 1051
package UriSolved;

import java.util.Scanner;

public class Taxes
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        
        if(salary>4500)System.out.printf("R$ %.2f\n",((salary-4500)*28)/100+1000*8/100+1500*18/100);
        else if(salary>3000 )System.out.printf("R$ %.2f\n",((salary-3000)*18)/100+1000*8/100);
        else if(salary>2000)System.out.printf("R$ %.2f\n",((salary-2000)*8)/100);
        else if(salary>=0 && salary<=2000)System.out.println("Isento");
    }
}
