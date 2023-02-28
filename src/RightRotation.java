import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/p2mef0y6s4uv/
public class RightRotation {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i]  = sc.nextInt();
        }
        int temp =arr[n-1];
        //if you like it give a star to this repo
        for (int i=n-1;i>0;i--) {
            arr[i] =arr[i-1] +arr[i];
            arr[i-1] =arr[i]-arr[i-1];
            arr[i] =arr[i]-arr[i-1];
        }

        arr[0] =temp;

        for (int m: arr) {
            System.out.print(m+" ");
        }
    }
}
/*
Problem Statement
    Given an array a, you must perform one right rotation on an array of n integers. In one right rotation, all elements will move one index to the right in a circular motion.
    Print the array's n space-separated integers after the right rotation.

Input
    The first line contains n.
    The next line contains n space-separated integers.

constraints
    1 ≤ n ≤ 105
    1 ≤ arr[i] ≤ 109

Output
    Print n space-separated integers of the array after the right rotation.
    Example
    Sample Input:
        5
        1 2 3 4 5

    Sample Output:
        5 1 2 3 4

 */