//URI 1010
package UriSolved;

import java.util.Scanner;

public class Simple_Calculate
{
    public static void main(String[] args) throws Exception
    {
        double product_to_pay = 0;
        Products products = null;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) 
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            double C = sc.nextDouble();

            products = new Products(A, B, C);
            product_to_pay = products.getValue_to_Pay()+product_to_pay;
        }
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", product_to_pay);
        
    }
}

class Products
{
    int product_code;
    int product_units;
    double per_unit_product_rate;
    
    public Products(int product_code, int product_units, double per_unit_product_rate) 
    {
        this.product_code = product_code;
        this.product_units = product_units;
        this.per_unit_product_rate = per_unit_product_rate;
    }

    public double getValue_to_Pay() 
    {
        double product_to_pay = product_units*per_unit_product_rate;
        return product_to_pay;
    }
    
}