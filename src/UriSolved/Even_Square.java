//URI 1073
package UriSolved;

import java.util.Scanner;

public class Even_Square
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int inputs = sc.nextInt();
        
        for(int i=1; i<=inputs; i++)
        {
            if(i%2==0 && i>2)
                System.out.println(i+"^"+2+" = "+i*i);
            else if(i%2==0)
                System.out.println(i+"^"+2+" = "+i*i);
        }
        
    }
}
