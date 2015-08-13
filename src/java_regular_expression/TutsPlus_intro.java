
package java_regular_expression;

public class TutsPlus_intro
{
    public static void main(String[] args)
    {
        System.out.println("hello readers".matches("hello readers")); //T
        System.out.println("hello readers.".matches("hello readers")); //F
        System.out.println("hello readers.".matches("hello readers.")); //T
        
        //period (.) is making optional by ? symbol
        System.out.println("hello readers.".matches("hello readers.?")); //T
        System.out.println("hello readers".matches("hello readers.?")); //T
        System.out.println("hello readers".matches("hello readers.")); //F
        
        //() == means a set of caracters
        System.out.println("hello readers".matches("(hello )?readers.?")); //T, "hello " & "." making optional 
        System.out.println("hello readers".matches("(hello)? readers.?")); //T, "hello" & "." making optional
        System.out.println(" readers".matches("(hello)? readers.?")); //T, "hello" & "." making optional
        System.out.println("readers".matches("(hello)? readers.?")); //F
        System.out.println("readers".matches("(hello)?\\s?readers.?")); //T, "hello" & " " making optional
        
//        url checking
        System.out.println("https".matches("https?")); //T, 
        System.out.println("http".matches("https?")); //T,
        
        System.out.println("https:".matches("https?:")); //T,
        
        System.out.println("https:www.".matches("https?:(www.)?")); //T, 
        System.out.println("https:".matches("https?:(www.)?")); //T, 
        
        System.out.println("https://".matches("https?:[//]{2}(www.)?")); //T, 
        System.out.println("https:///".matches("https?:[//]{2,3}(www.)?")); //T, 
        
        System.out.println("https://saifursoft".matches("https?:[//]{2,3}(www.)?[a-zA-Z0-9_-]+")); //T, 
        System.out.println("https://saifursoft.com".matches("https?:[//]{2,3}(www.)?[a-zA-Z0-9_-]+(.com)")); //T, 
        System.out.println("https://saifursoft.me".matches("https?:[//]{2,3}(www.)?[a-zA-Z0-9_-]+(.com|.me)")); //T, 
        
        
    }
}
