//URI 1557
package UriSolved;

import java.util.Scanner;

public class Square_Matrix_III1
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a ;
        while ((a = sc.nextInt())!=0) 
        {    
            int num[][] = null;
            int toatal = 1;
            num = new int[a][a];
            for (int i = 0; i <  a; i++) 
            {
                for (int j = 0; j <  a; j++) 
                {
                    if(i>0)
                    {
                        num[i][j] = num[i-1][j]*2;
                    }
                    if(i==0 && j==0)
                        num[i][j] = j+1;
                    if(i==0 && j>0)
                        num[i][j] = num[i][j-1]*2;
                }
            }
            for (int i = 0; i < a; i++) 
            {
                for (int j = 0; j <  a; j++) 
                {
                    
                    if((j+1)%a==0)
                    {
                        System.out.printf("%d",num[i][j]);
                    }
                    else
                        System.out.printf("%d ",num[i][j]);
                    
                }
                System.out.println();
                
            }
            System.out.println();
        }
    }
}
