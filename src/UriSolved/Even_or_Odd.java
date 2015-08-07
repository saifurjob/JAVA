//URI 1074
package UriSolved;

import java.util.Scanner;

public class Even_or_Odd
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int inputs = sc.nextInt();
        
        int[] num= new int[inputs];
        for(int i=0; i< inputs; i++)
        {
            num[i] = sc.nextInt();
        }
        for(int i=0; i<inputs; i++)
        {
            if(num[i]>0 && num[i]%2==0)System.out.println("EVEN POSITIVE");
            if(num[i]>0 && num[i]%2==1)System.out.println("ODD POSITIVE");
            if(num[i]==0)System.out.println("NULL");
            if(num[i]<0 && num[i]%2==0)System.out.println("EVEN NEGATIVE");
            if(num[i]<0 && num[i]%2==-1)System.out.println("ODD NEGATIVE");
        }
        
    }
}
