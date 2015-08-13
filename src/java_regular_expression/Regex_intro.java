package java_regular_expression;

public class Regex_intro
{
    public static void main(String[] args)
    {
        
        System.out.println("1");
        System.out.println("5".matches("^[0-9]")); // t, check the first char of the string if it's a 0 through 9, a number 
        System.out.println("s".matches("^[0-9]")); // f, check the first char of the string if it's not a 0 through 9, not a number
        System.out.println("5555".matches("^[0-9]{1,}")); // t, 
        System.out.println("");
        System.out.println("5".matches("[0-9]$")); // t, check the last char of the string if it's a 0 through 9, a number 
        System.out.println("s".matches("[0-9]$")); // f, check the last char of the string if it's not a 0 through 9, not a number
        System.out.println("2");
        
        System.out.println("behaviour".matches("behaviou?r")); // t, checks "behaviour" here "ou", "u" can exist or not at all 
        System.out.println("behavior".matches("behaviou?r")); // t, checks "behaviour" here "ou", "u" can exist or not at all
        
        System.out.println("behaviouur".matches("behaviou?r")); // t, checks "behaviour" here "ou", "u" can exist or not at all
        System.out.println("behavioor".matches("behaviou?r")); // t, checks "behaviour" here "ou", "u" can exist or not at all
        System.out.println("3");
        
        System.out.println("saifur".replace("ur", "")); //saifur
        System.out.println("rafiqul".replace("ul", "")); //rafiq
        System.out.println("4");
        
        System.out.println("1".matches("[0-9][0-9]+")); // f, checks if it has minimum 2 numbers
        System.out.println("12".matches("[0-9][0-9]+")); // t
        System.out.println("123".matches("[0-9][0-9]+")); // t
        System.out.println("5");
        
        System.out.println("xyz".matches("xy{1}z")); // t, after x & before z, checks y, only 1 time
        System.out.println("xyyyyz".matches("xy{1,}z")); // t,after x & before z,  checks y, munimum 1 time & maxumun unlimited
        System.out.println("xyyyyyz".matches("xy{1,5}z")); // t, after x & before z, checks y, munimum 1 time & maximum 5 times
        System.out.println("6");
        
        System.out.println("555".matches("[0-9]{3}")); // t, checks numbers respectively, only 3 times
        System.out.println("5556".matches("[0-9]{3}")); // f, checks numbers respectively, only 3 times
        System.out.println("5556".matches("[0-9]{3,}")); // t, checks numbers respectively, minimum 3 times & maximum unlimited
        System.out.println("7");
        
        System.out.println("880-1703-188752".matches("[0-9]{3}-[0-9]{4}-[0-9]{3,}")); // t, 
        System.out.println("+880-1703-188752".matches("[0-9 \\+]{4}-[0-9]{4}-[0-9]{3,}")); // t, 
        System.out.println("+880-1703-188752".matches("[\\d \\+]{4}-[\\d]{4}-[\\d]{3,}")); // t, 
        System.out.println("8");
        
        System.out.println("saifurjob@gmail.com".matches("[0-9a-zA-Z@]+.[a-zA-Z]+")); // t, mail address validating
        System.out.println("saifurjob@gmail.com".matches("[0-9a-zA-Z@.]+")); // t, mail address validating
        System.out.println("saifurjob@gmail.com".matches("[0-9a-zA-Z@.\\s]+")); // t, mail address validating with space
        System.out.println("saifurjob @gmail.com".matches("[0-9a-zA-Z@.\\s]+")); // t, mail address validating with space
        System.out.println("saifurjob @gmail.com".matches("[0-9a-zA-Z@.\\S]+")); // f, mail address validating without space
        System.out.println("saifurjob@gmail.com".matches("[0-9a-zA-Z@.\\S]+")); // t, mail address validating without space
        System.out.println("9");
        
        System.out.println("ihaveacat".matches("\\bhave\\b")); // t, mail address validating without space
        System.out.println("10");
        
    }
}
































