//URI 1017
package UriSolved;

import java.util.Scanner;

public class Fuel_Spent_1
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        Fuel_Spent fuel_Spent = new Fuel_Spent(A, B);
        System.out.printf("%.3f\n", fuel_Spent.getAverage_speed());
    }
}

class Fuel_Spent
{
    int time_spent;
    int average_speed;

    public Fuel_Spent(int time_spent, int average_speed) 
    {
        this.time_spent = time_spent;
        this.average_speed = average_speed;
    }

    public double getAverage_speed() 
    {
        return (average_speed*time_spent)/12.0;
    }
}