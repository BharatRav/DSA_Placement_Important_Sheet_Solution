import java.util.Scanner;

//Link:-https://my.newtonschool.co/playground/code/n5k92ymmiitq/
public class ArraySumWithoutLoops {
    private  static long recursivelySum(int[] arr, int currIndex,int size) {
        //base case;
        if (currIndex>size) {
            return 0;
        }
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav

        return arr[currIndex] + recursivelySum(arr,currIndex+1,size);
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(recursivelySum(arr,0,n));
    }
}
/*
Problem Statement
Given an array of n integers. Print the sum of all numbers in the array without using any loop.
Input
First line contains a single integer denoting n.
Next line contains n space separated integer.

Constraints
1 <= n <= 105
1 <= arr[i] <= 109
Output
A single integer denoting the sum.
Example
Input:
4
3 9 2 7

Output:
21
 */
