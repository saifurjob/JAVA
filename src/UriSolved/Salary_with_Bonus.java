//URI 1009
package UriSolved;

import java.util.Scanner;

public class Salary_with_Bonus
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        Employee1 e =  new Employee1(A, B, C);
        System.out.printf("TOTAL = R$ %.2f\n",e.get_Total_Salary());
    }
}

class Employee1
{
    String employee_Name;
    double fixed_Salary;
    double sold_by_him;

    public Employee1(String employee_Name, double fixed_Salary, double sold_by_him) 
    {
        this.employee_Name = employee_Name;
        this.fixed_Salary = fixed_Salary;
        this.sold_by_him = sold_by_him;
    }

    public double get_Total_Salary() 
    {
        double percent_win = (sold_by_him*15)/100;
        return fixed_Salary+percent_win;
    }

    
    
}