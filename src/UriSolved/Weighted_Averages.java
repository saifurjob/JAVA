//URI 1079
package UriSolved;

import java.util.Scanner;

public class Weighted_Averages
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[][] a = new double[N][N];
        int[] b = {2,3,5};
        float[] total = new float[N];
        
        for (int i = 0; i < N; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                a[i][j] =  sc.nextDouble();
            }
        }
        for (int i = 0; i < N; i++) 
        {
            total[i]=0;
            for (int j = 0; j < 3; j++) 
            {
                total[i]=(float) (a[i][j]*b[j])+total[i];
            }
            System.out.printf("%.1f\n",total[i]/10);
        }
        
    }
}
