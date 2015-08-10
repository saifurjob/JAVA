package java_regular_expression;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex_intro
{
    public static void main(String[] args)
    {
        
        System.out.println("5".matches("^[0-9]")); // t, check the first char of the string if it's a 0 through 9, a number 
        System.out.println("s".matches("^[0-9]")); // f, check the first char of the string if it's not a 0 through 9, not a number
        System.out.println("");
        System.out.println("5".matches("[0-9]$")); // t, check the last char of the string if it's a 0 through 9, a number 
        System.out.println("s".matches("[0-9]$")); // f, check the last char of the string if it's not a 0 through 9, not a number
        System.out.println("");
        
        System.out.println("behaviour".matches("behaviou?r")); // t, checks "behaviour" here "ou", "u" can exist or not at all 
        System.out.println("behavior".matches("behaviou?r")); // t, checks "behaviour" here "ou", "u" can exist or not at all
        
        System.out.println("behaviouur".matches("behaviou?r")); // t, checks "behaviour" here "ou", "u" can exist or not at all
        System.out.println("behavioor".matches("behaviou?r")); // t, checks "behaviour" here "ou", "u" can exist or not at all
        
        
    }
}
