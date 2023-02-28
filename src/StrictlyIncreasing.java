import java.util.Arrays;
import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/acs8l6j9sa2g/
public class StrictlyIncreasing {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i] =sc.nextInt();
        }
        //if you like it plz give a star to the repo
        //it'll motivate us to solve more question
        Arrays.sort(arr);
        for (int i=1;i<n;i++) {
            if(arr[i-1]==arr[i]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
/*
Problem Statement
Given an integer array a of size N. Find out if by rearranging the elements, you can make the array strictly increasing. In other words, determine if it is possible to rearrange the elements such that a1 < a2 < ⋯ < a n holds.

You must solve this problem in O(N) time complexity.
Input
First line contains n.
Next line contains n space separated integers.

Constraints
1 <= n <= 105
1 <= a[i] <= 105
Output
Print "YES" or "NO".
Example
Input:
5
2 1 90 2 4

Output:
NO
 */
