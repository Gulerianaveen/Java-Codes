/* It's PTM tomorrow in Cambridge School.Teachers want to show the grades from(A to E) depending on the percentage of the student. 
Help the teacher's by developing the program for the same.To find the grade of a student, given the marks of N subjects. 
Given the marks of N subjects, we have to print the grade of a student based on the following grade slab.

If Percentage Marks > 90, Grade is A+ If 70 <= Percentage Marks <= 89, Grade is A If 60 <= Percentage Marks <= 69,
Grade is B If 50 <= Percentage Marks <= 59, Grade is C If Percentage Marks <= 40, Grade is D

Input Format:
Integer Value to enter number of subjects, count Enter marks of subjects depending upon the the total number of subjects

Constraints:
Number of subjects should not exceed 7

Output Format :
Character output to show grades */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int sum=0,per;
         int N = sc.nextInt();
         int marks[] = new int[N];
         if(N<8){
            for(int i = 0 ;i<N;i++){
                marks[i]=sc.nextInt();
            }
            for(int i = 0 ; i<N;i++){
                sum= sum + marks[i];
            }
            per = sum/N;
            if(per>90){
                System.out.println("A+");
            }
            else if((per>=70)&&(per<=89)){
                System.out.println("A");
            }
            else if((per>=60)&&(per<=69)){
                System.out.println("B");
            }
            else if((per>=50)&&(per<=59)){
                System.out.println("C");
            }
            else{
                System.out.println("D");
            }
         }
         else{
            System.out.println("Invalid");
         }
         sc.close();
    }
}
