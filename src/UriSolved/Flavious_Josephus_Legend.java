//URI 1030
package UriSolved;

import java.util.ArrayList;
import java.util.Scanner;

public class Flavious_Josephus_Legend
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        try 
        {
            ArrayList<Integer> l = null;
            for (int i = 0; i < cases; i++) 
            {
                int n = sc.nextInt();
                int k = sc.nextInt();
                l = new ArrayList<Integer>();

                for (int j = 0; j < n; j++) 
                {
                    l.add(j+1);
                }
                //done
                
                for (int j = -1; ; ) 
                {
                    if (l.size() == 1) 
                        break;

                    if(j<n-k)
                    {
                        j += k;
                    }
                    else
                    {
                        j = (k-1)-(l.size()-(j));
                        System.out.println("j = (k-1)-(l.size()-(j));");
                    }
                    l.remove(j-1);
                    System.out.println(l.clone());
                }
                System.out.println("Case " + (i+1) + ": " + l.get(0));
            }
        } catch (IndexOutOfBoundsException e) {
        }
    }
}
