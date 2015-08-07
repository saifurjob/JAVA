//URI 1309
package UriSolved;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Monetary_Formatting
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            while (true) 
            {                
                int a =sc.nextInt();
                int b =sc.nextInt();
                System.out.print("$");
                String s1 = a+"";
                String reverseS1 = new StringBuffer(s1).reverse()+"";
                String revrevS1 = "";
                for (int i = 0; i < reverseS1.length(); i++) 
                {
                    revrevS1+=reverseS1.charAt(i);
                    if((i+1)%3==0 && i!=reverseS1.length()-1)
                    {
                        revrevS1+=",";
                    }
                }
                System.out.print(new StringBuffer(revrevS1).reverse()+"");
//                for (int i = 0; i < reverseS1.length(); i++) 
//                {
//                    System.out.print(reverseS1.charAt(i));
////                    if((i+1)%3==0)
////                        System.out.print(",");
//                }
                
                if(b==0)
                    System.out.println(".00");
                else if(b>0 && b<=9)
                    System.out.println(".0"+b);
                else
                    System.out.println("."+b);
            }
            
        } catch (NoSuchElementException e) 
        {
            
        }
    }
}
