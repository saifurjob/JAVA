// Dragon of Loowater
//http://acm.hust.edu.cn/vjudge/contest/view.action?cid=80454#problem/D

package Jami_sir;

import java.util.Arrays;
import java.util.Scanner;

public class Between_the_Mountains
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        int caseNumber = 0;
        while (caseNumber< caseNum) 
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int a1[] = new int[a];
            int b1[] = new int[b];
            
            for (int i = 0; i < a; i++) 
            {
                a1[i] = sc.nextInt();
            }
            for (int i = 0; i < b; i++) 
            {
                b1[i] = sc.nextInt();
            }
            int min, max;
            if(a<b){min=a; max=b;}
            else {min=b; max=a;}
            
            int[] arr = new int[min];
            
            for (int i = 0; i < min; i++) 
            {
                arr[i] = (Math.abs(a1[i] - b1[i]));
            }

            Arrays.sort(arr);
            
            System.out.println(arr[0]);
            caseNumber++;
        }
    }
}
