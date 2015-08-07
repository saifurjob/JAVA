//URI  1097
package UriSolved;


public class Sequence_IJ_3
{
    public static void main(String[] args) throws Exception
    {
        for (int i = 1; i<=9; i+=2) 
        {
            for (int j=7 ; j >=5; j--) 
            {
                System.out.println("I="+i+" J="+(j+i-1));
            }
            
        }
    }
}
