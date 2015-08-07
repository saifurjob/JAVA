// Dragon of Loowater
//http://acm.hust.edu.cn/vjudge/contest/view.action?cid=80454#problem/E

package Jami_sir;

import java.util.Arrays;
import java.util.Scanner;

public class Dragon_of_Loowater 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n, m;
        
        
        while ((n=sc.nextInt())!=0 && (m=sc.nextInt())!=0 ) 
        {
            int arrN[]= new int[n];
            int arrM[]= new int[m];
            
            try {
                for (int i = 0; i < n; i++) {
                    arrN[i] = (sc.nextInt());
                }
                for (int i = 0; i < m; i++) {
                    arrM[i] = (sc.nextInt());
                }
                } catch (IndexOutOfBoundsException e) {
                }
            
            Arrays.sort(arrN);
            Arrays.sort(arrM);
            
            if(m<n)
            {
                System.out.println("Loowater is doomed!");
            }
            else
            {
                int count=0;
                int sum=0;
                
                try 
                {
                    for (int i = 0; i < m; i++) 
                    {
                        if (arrN[i] <= arrM[i]) 
                        {
                            if (count <= n) 
                            {
                                sum += arrM[i];
                                count++;
                            }
                        }

                    }
                } catch (IndexOutOfBoundsException e) {
                }
                if(count== n )
                {
                    System.out.println(sum);
                }
                else 
                {
                    System.out.println("Loowater is doomed!");
                }
            }
            
        }
    }
}
