//URI 1516
package UriSolved;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Image
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N,M;
        try 
        {
            while (true ) 
            {       
                ArrayList<String> arr = new ArrayList<String> ();
                N = sc.nextInt();
                M = sc.nextInt();
                if(N==0 && M==0 )
                    break;
                for (int i = 0; i < N; i++) 
                {
                    arr.add(sc.next());
                }

                int a, b;
                a = sc.nextInt();
                b = sc.nextInt();
                try 
                {
                    for (int i = 0; i < a; i++) 
                    {
                        for (int l = 0; l < a/N; l++) 
                        {
                            for (int j = 0; j < b / M; j++) 
                            {
                                for (int k = 0; k < b / M; k++) 
                                {
                                    System.out.print(arr.get(i).charAt(j));
                                }
                            }
                            System.out.println();
                        }
                    }
                } catch (IndexOutOfBoundsException e) {
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
        }
    }
}
