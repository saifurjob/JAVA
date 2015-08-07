//URI 10015
package UriSolved;

import java.util.Scanner;

public class Distance_Between_Two_Points
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        double X1 = sc.nextDouble();
        double Y1 = sc.nextDouble();
        
        double X2 = sc.nextDouble();
        double Y2 = sc.nextDouble();
        
        Distance p1 = new Distance(X1, Y1);
        Distance p2 = new Distance(X2, Y2);
        
        double distance = Math.sqrt((p1.X-p2.X)*(p1.X-p2.X)+(p1.Y-p2.Y)*(p1.Y-p2.Y));
        System.out.printf("%.4f\n",distance);
        
    }
}

class Distance
{

    double X,Y ;

    public Distance(double X, double Y) 
    {
        this.X = X;
        this.Y = Y;
    }

}