import java.util.Arrays;
import java.util.Scanner;

//Link:-https://my.newtonschool.co/playground/code/h13taoskm9w4/
public class SumOfSmallestElements {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //if you like it plz give a star to the repository
        //it'll motivate us to do more question

        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        long answer =0;
        for (int i=0;i<4;i++) {
            answer+=arr[i];
        }
        System.out.println(answer);
    }
}
/*
Problem Statement
Given an array of N integers, find the 4 smallest number of the array and print their sum.
Input
First line contains n.
next line contains n space separated integers.

Constraints
4 <= n <= 105
1 <= arr[i] <= 109
Output
A single integer denoting the sum.
Example
Input:
6
3 1 6 9 4 1

Output:
9

Explanation :
3 + 1 + 4 + 1 = 9
 */
/*
Problem Statement
Given an array of N integers, find the 4 smallest number of the array and print their sum.
Input
First line contains n.
next line contains n space separated integers.

Constraints
4 <= n <= 105
1 <= arr[i] <= 109
Output
A single integer denoting the sum.
Example
Input:
6
3 1 6 9 4 1

Output:
9

Explanation :
3 + 1 + 4 + 1 = 9
 */
