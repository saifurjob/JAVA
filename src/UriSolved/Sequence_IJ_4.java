//URI  1098
package UriSolved;


public class Sequence_IJ_4
{
    public static void main(String[] args) throws Exception
    {
        for (int i = 0; i<=2; i++) 
        {
            for (int j=1 ; j <=3; j++) 
            {
                System.out.println("I="+i+" J="+j);
            }
            if(i==2)break;
            for (int j=1 ; j <=3; j++) 
            {
                System.out.println("I="+i+".2"+" J="+j+".2");
            } 
            
        }
    }
}
