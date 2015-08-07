
package DataStructure.PrimeNumber;

import java.util.ArrayList;
import java.util.Scanner;


public class PrimeFactorization_Detection
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrimeFactorization factorization = new PrimeFactorization(num);
        ArrayList<Integer> factors = factorization.getFactors();
        for (int i = 0; i < factors.size(); i++) 
        {
            System.out.println(factors.get(i));
        }
    }
}

class PrimeFactorization
{
    int num;

    public PrimeFactorization(int num) {
        this.num = num;
    }
    
    public ArrayList<Integer> getFactors() 
    {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= num; i++) 
        {
            if(num%i==0)
            {
                //15%3==0
                //5%5=0
                factors.add(i);
                num /=i;
                // 15/3 = 5
                // 5/5 = 1
            }
        }
        return factors;
    }
    
}