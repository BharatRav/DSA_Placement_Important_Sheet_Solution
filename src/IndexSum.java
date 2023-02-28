import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/1orvxn6p1l9e/
public class IndexSum {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new  Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        //if yu like it plz give a star  to this repo
        //it'll motivate us to do more question
        Map<Integer,Integer> map = new HashMap<>();
        int maxSum=0;
        for (int i=0;i<n;i++) {
            if(map.containsKey(arr[i])) {
                maxSum =Math.max(maxSum,map.get(arr[i])+i+1);

            }

            map.put(arr[i],i+1);
        }
        System.out.println(maxSum);
    }
}
/*
Problem Statement
Given an array a of n integers. Find the maximum value of (i + j) such that 1 ≤ i < j ≤ n and a[i] = a[j].
Input
The First line of the input contains n.
The next line contains n space-separated integers.

Constraints
1 ≤ n ≤ 105
1 ≤ a[i] ≤ n
Output
Output a single integer denoting maximum sum.
Example
Input:
6
2 3 1 2 3 5

Output:
7

Explanation:
for 2 => i = 1, j = 4 => i+j = 5
for 3 => i = 2, j = 5 => i+j = 7
 */
