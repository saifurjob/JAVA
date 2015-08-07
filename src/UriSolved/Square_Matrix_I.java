//URI 1435
package UriSolved;

import java.util.Scanner;

public class Square_Matrix_I
{
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int num[][] = null;
        while ((a = sc.nextInt())!=0) 
        {            
            num = new int[a][a];
            for (int i = 0; i < a; i++) 
            {
                for (int j = 0; j < a; j++) 
                {
                    if(i==j && i== a/2 && a%2==1)
                        num[i][j] = i+1;
                    else if((i== a/2 || i== a/2-1 || j== a/2 || j== a/2-1)&& a%2==0)
                        num[i][j] = (a/2);
                    else 
                        num[i][j] = 1;
                }
            }
            
            for (int i = 0; i < a; i++) 
            {
                for (int j = 0; j < a; j++) 
                {
                        System.out.print(num[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
