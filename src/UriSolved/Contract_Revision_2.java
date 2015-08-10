//URI 1120
package UriSolved;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Contract_Revision_2
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        try 
        {
            while (true) 
            {      
                int a = sc.nextInt();
                long b = sc.nextLong();
                if(a==0 && b==0)    break;
                
                String x = a+"";
                String y = b+"";
                
//                System.out.println(b);
                if(!y.contains(x))
                {
                    System.out.println(b);
                }
                else
                {
                    String regex = "[^["+a+"]+]";
                    y = y.replaceAll(regex, "");
                    if(y.length()==0)   
                        System.out.println(0);
                    else    
                        System.out.println(Integer.parseInt(y));
                }
            }
        } catch (NoSuchElementException e) {
        }catch(NumberFormatException e)
        {}
            
    }
}