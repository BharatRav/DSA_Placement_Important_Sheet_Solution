import java.util.Arrays;
import java.util.Scanner;

//Link:-https://my.newtonschool.co/playground/code/4z0qos1gd0pw/
public class TwoSumMaximization {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav

        System.out.println(arr[n-1]+arr[n-2]);
    }
}
/*
Problem Statement
You are given an array A of size N. For all pairs (i, j) (1 <= i < j <= N), find the maximum value of Ai + Aj in the array.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
2 <= N <= 105
1 <= Ai <= 109
Output
Print the maximum value of Ai + Aj in the array.
Example
Sample Input:
5
6 4 9 3 7

Sample Output:
16
 */