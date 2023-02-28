import java.util.Scanner;

public class DuplicateArray {
    public static void main (String[] args) {
        // Your code here
        Scanner sc =  new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        //if you like it plz give a star to this repo

        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }

        for (int i=0;i<n*m;i++) {
            System.out.print(arr[i%n]+" ");
        }
    }
}
/*
Problem Statement
Write a Program to duplicate an array N number of times.
Input
The first line of the input contains two space separated integers N and M - The size of an array and Number of times to be repeated.
The second line contains N space separated integers A1, A2,. , An.

Constraints
1 ≤ N,M ≤ 100
1 ≤ A[i] ≤ 1000
Output
Print the required output.
Example
Sample Input
3 2
1 2 3

Sample Output
1 2 3 1 2 3
 */
