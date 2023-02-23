// Consider that in a plantation activity, the municipality is planting trees in an order such that the smallest tree is planted first and the biggest at the end. While arranging the trees, before planting, to position them at their positions, they are swapped in such a way that a tree can only be swapped with its adjacent trees. wAP to implemennt the same using method which contain the logic of sorting. Consider 10 trees height as input.

// Input Format

// 71 70 69 68 65 71 68 61 63

// Constraints

// Consider that there are 10 are present in the activity and their lenghts are in integer numbers (between 60 inches to 72 inches).

// Output Format

// 61 63 65 68 68 69 70 71 71

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i] = sc.nextInt();
        }
       for(int i=0;i<10;i++)
       {
            for(int j=0;j<10-i-1;j++)
            {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
       }
        for(int i=0;i<10;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
