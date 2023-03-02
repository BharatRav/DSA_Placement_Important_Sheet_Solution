import java.util.Arrays;
import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/q8gvrm7mq6uk/
public class PairEmUpContest {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);

        long max=0;

        for (int i=0;i<n/2;i++) {
            max =Math.max(max,arr[i]+arr[n-i-1]);
        }
        System.out.println(max);
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
    }
}
/*
Problem Statement
Given an array of N elements where N is even. You have to pair up the elements into N/2 pairs such that each element is in exactly 1 pair. You need to find minimum possible X such that there exists a way to pair the N elements and for no pair sum of its elements is greater than X.
Input
First line contains N.
Second line contains N space separated integers, denoting array.

Constraints:
1 <= N <= 100000
1 <= elements of the array <= 1000000000
Output
Print a single integer, minimum possible X.
Example
Sample Input
4
3 1 1 4

Sample Output
5

Explanation: we can pair (1, 3) and (1, 4) so all pairs have sum less than or equal to 5.
 */
