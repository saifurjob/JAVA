//URI 1101
package UriSolved;
import java.util.Scanner;

public class Sequence_of_Numbers_and_Sum
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        int caseNum = 3;
        int M[] = new int[caseNum];
        int N[] = new int[caseNum];
        int min, max;
        
        for (int i = 0; i < caseNum; i++) 
        {
            M[i] =sc.nextInt(); 
            N[i] =sc.nextInt(); 
            
            if(M[i]<N[i])
            {
                min = M[i];
                max = N[i];
            }
            else 
            {
                min = N[i];
                max = M[i];
            }
            
            if(min==0 || max==0)continue;
            int sum = 0;
            for (int j = min; j <= max; j++) 
            {
                sum+=j;
                System.out.print(j+" ");
            }
            System.out.println("Sum="+sum);
        }
        
        
    }
}
