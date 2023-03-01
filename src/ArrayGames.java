import java.util.Scanner;
import java.util.TreeSet;
//Link:-https://my.newtonschool.co/playground/code/s24hnprcoi9n/
public class ArrayGames {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k =sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        int i=0;
        int max=0;
        int start=0;
        while (i<n) {
            treeSet.add(arr[i++]);
            if (treeSet.last()-treeSet.first()<=k) {
                max =Math.max(max, treeSet.size());
            } else {
                treeSet.remove(arr[start++]);
            }
        }
        System.out.println(max);
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav

    }
}
/*
Problem Statement
Given an array A of size N, find the maximum subarray size such that the difference between the maximum and minimum elements of the subarray is <= K.
Input
First line of the input contains two integers N and K.
The second line of the input contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= K <= 109
1 <= Ai <= 109
Output
Print the maximum subarray size such that the difference between the maximum and minimum elements of the subarray is <= K.
Example
Sample Input:
5 3
3 5 2 7 1

Sample Input:
3

Explanation:
We can take subarray [3, 5, 2]. No subarray of size 4 or larger will satisfy the condition.
 */
