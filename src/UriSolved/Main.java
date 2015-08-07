//URI 1154
//http://acm.hust.edu.cn/vjudge/contest/view.action?cid=80897#problem/D

package UriSolved;

import java.util.InputMismatchException;
import java.util.Scanner;

//public class Shopaholic
public class Main
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            int m = 0;
            int cases=sc.nextInt() ;
            while (true)
            {      
                if(!(m<cases))break;
                int a = sc.nextInt();
                int[] arr =  new int[a];
                for (int i = 0; i < a; i++) 
                {
                    arr[i] = sc.nextInt();
                }
//                Shopaholic shopaholic = new Shopaholic();
                Main mainObj = new Main();
//                shopaholic.sort(arr);
                mainObj.sort(arr);
                int total=0;
                for (int i = 0; i < arr.length; i+=3) 
                {
                    total+=arr[i];
                }
                System.out.println(total);
                m++;
            }
        } catch (InputMismatchException e) {
        }
    }
    private int[] numbers;
    private int[] helper;

    private int number;
    
    public void sort(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        mergesort(0, number - 1);
    }

    private void mergesort(int low, int high) {
        // check if low is smaller then high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
    // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }

    }
}
