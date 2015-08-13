
package java_regular_expression;

public class Character_classes_and_alterations
{
    public static void main(String[] args)
    {
        System.out.println("grey".matches("gr[ae]y")); //T
        System.out.println("gray".matches("gr[ae]y")); //T
        
        System.out.println("The".matches("[Tt]he")); //T
        System.out.println("the".matches("[Tt]he")); //T
        
        System.out.println("abccccc".matches("[ab]+c+")); //T
        System.out.println("bccccc".matches("[ab]+c+")); //T
        System.out.println("ccccc".matches("[ab]+c+")); //F
        System.out.println("absadafasedsccccc".matches("[ab]+c+")); //F
        
        System.out.println("abccccc".matches("//c+//g")); //T
    }
}
