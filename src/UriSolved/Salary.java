//URI 1008
package UriSolved;

import java.util.Scanner;

public class Salary
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double C = sc.nextDouble();
        Employee e = new Employee(A, B, C);
        System.out.println("NUMBER = "+e.getEmployee_Id());
        Double salary = e.getSalary();
        System.out.printf("SALARY = U$ %.2f\n",salary);
    }
}

class Employee
{
    int employee_Id;
    int working_hours;
    double salary_rate;

    public Employee(int employee_Id, int working_hours, double salary_rate) 
    {
        this.employee_Id = employee_Id;
        this.working_hours = working_hours;
        this.salary_rate = salary_rate;
    }

    public int getEmployee_Id() 
    {
        return employee_Id;
    }

    public double getSalary() 
    {
        return salary_rate*working_hours;
    }
    
}