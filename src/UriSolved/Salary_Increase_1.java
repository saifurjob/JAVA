//URI 1048
package UriSolved;

import java.util.Scanner;

public class Salary_Increase_1
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        
        Salary_Increase salary_Increase = new Salary_Increase(salary);
        
        if(salary>=0 && salary<=400.00) salary_Increase.Total(15);
        else if(salary>=400.01 && salary<=800.00) salary_Increase.Total(12);
        else if(salary>=800.01 && salary<=1200.00) salary_Increase.Total(10);
        else if(salary>=1200.01 && salary<=2000.00) salary_Increase.Total(7);
        else if(salary>2000 ) salary_Increase.Total(4);
    }
}

class Salary_Increase
{
    double salary;

    public Salary_Increase(double salary) 
    {
        this.salary = salary;
    }
    
    
    public void Total(int percentise)
    {
        double increased_salary = (percentise*salary)/100.00;
        double total_salary = salary+increased_salary;
        System.out.printf("Novo salario: %.2f\n", total_salary);
        System.out.printf("Reajuste ganho: %.2f\n", increased_salary);
        System.out.printf("Em percentual: %d ", percentise);
        System.out.println("%");
    }
}