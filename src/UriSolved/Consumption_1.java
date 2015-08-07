//URI 1013
package UriSolved;

import java.util.Scanner;

public class Consumption_1
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        double B = sc.nextDouble();
        
        Consumption consumption = new Consumption(A, B);
        System.out.printf("%.3f km/l\n", consumption.getMedium_of_Car_consumption());
    }
}

class Consumption
{
    int distance;
    double spent_fuel;

    public Consumption(int distance, double spent_fuel) 
    {
        this.distance = distance;
        this.spent_fuel = spent_fuel;
    }

    public double getMedium_of_Car_consumption() 
    {
        return distance/spent_fuel;
    }
    
    
}