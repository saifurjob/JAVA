//URI 1234
package UriSolved;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Dancing_Sentence
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int k =0;
        try 
        {
            while ((s = sc.nextLine()).length() <= 50) 
            {
                String s1="";
                
                for (int i = 0; i < s.length(); i++) 
                {
                    if (i % 2 == 0) 
                    {
//                        System.out.print(s.toUpperCase().charAt(i));
                        s1+=s.toUpperCase().charAt(i);
                    } 
                    else 
                    {
//                        System.out.print(s.toLowerCase().charAt(i));
                        s1+=s.toLowerCase().charAt(i);
                    }
                    
                }
                String s2[] = s1.split(" ");
                for (int j = 0; j < s2.length; j++) 
                {
                    if(j==s2.length-1)
                        System.out.print(s2[j]+"dasdas");
                    else    
                        System.out.print(s2[j] +" ");
                }
                System.out.println();
                k++;
            }
        } catch (NoSuchElementException e) {
        }
    }
}
