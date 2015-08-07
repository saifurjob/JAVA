//URI 1045
package UriSolved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Simple_Sort
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> arr = new ArrayList<Integer>(3);
        arr.add(sc.nextInt());
        arr.add(sc.nextInt());
        arr.add(sc.nextInt());
        
        ArrayList<Integer> temp = new ArrayList<Integer>(3);
        
        temp.addAll(arr);
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) 
        {
            System.out.println(arr.get(i));
            
        }
        
        System.out.println();
        for (int i = 0; i <temp.size(); i++) 
        {
            System.out.println(temp.get(i));
            
        }
    }
}
