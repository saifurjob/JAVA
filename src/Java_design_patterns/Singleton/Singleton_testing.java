
package Java_design_patterns.Singleton;

public class Singleton_testing 
{
    public static void main(String[] args) 
    {
        System.out.println(Singleton.getInstance());
    }
}
class Singleton
{
    private static Singleton instance = null;

    private Singleton() 
    {
        
    }
    public static Singleton getInstance() 
    {
        if(instance==null)
            instance =  new Singleton();
        return instance;
    }
    
}
