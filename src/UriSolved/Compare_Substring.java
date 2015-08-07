//URI 1237
package UriSolved;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Compare_Substring
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;
        try 
        {
            while (true) 
            {
                s1 = sc.nextLine().trim();
                s2 = sc.nextLine().trim();
                ArrayList<String> list = new ArrayList<String>();
                for (int i = 0; i < s1.length(); i++) 
                {
                    s3 = "";
                    for (int j = 0; j < s2.length(); j++) 
                    {
                        if(s1.charAt(i)==s2.charAt(j))
                        {
                            for (int k = i, l = 0; k < s1.length() ||  l < s2.length(); k++,l++) 
                            {
                                if(s1.charAt(k)==s2.charAt(l))
                                s3+=s1.charAt(k)+"";
                            }
                        }
                        else
                            break;
                    }
                    System.out.println(s3);
                    list.add(s3);
                }
            }
        } catch (NoSuchElementException e) {
        }
    }
}
