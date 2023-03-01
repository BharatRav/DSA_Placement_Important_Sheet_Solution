import java.util.Arrays;
import java.util.Scanner;
//Link:-
public class SumOfLargestElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr =new int[n];
        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question

        Arrays.sort(arr);

        long answer = 0;
        for (int i=n-1;i>n-5;i--) {
            answer+=arr[i];
        }
        System.out.println(answer);
    }
}
/*
Problem Statement
Given an array of N integers, Find the sum of the Four largest numbers of the array and print it.
Input
The first line contains n.
The next line contains n space-separated integers.

Constraints
4 ≤ n ≤ 105
1 ≤ arr[i] ≤ 109
Output
A single integer denoting the sum.
Example
Input:
6
3 1 6 9 4 6

Output:
25

Explanation :
6 + 9 + 4 + 6 = 25
 */
