//URI 1154
package UriSolved;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Justifier_II
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int input, k=0;
        try 
        {
            while ((input = sc.nextInt()) != 0) 
            {           
                if(k!=0)
                    System.out.println();
                k++;
                ArrayList<String> s = new ArrayList<String>();
                int max = 0;
                for (int i = 0; i < input; i++) 
                {
                    s.add(sc.nextLine().trim());
                    
                    if(max<s.get(i).length())
                        max=s.get(i).length();
                }
                for (int i = 0; i < input; i++) 
                {
                    if(max>max-(s.get(i).length()))
                    {
                        for (int j = 0; j < max-(s.get(i).length()); j++) 
                        {
                            System.out.print(" ");
                        }
                        System.out.println(s.get(i));
                    }
                    else
                        System.out.println(s.get(i));
                }

            }
        } catch (InputMismatchException e) {
        }
    }
}
