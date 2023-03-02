import java.util.Arrays;
import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/c7oiab98wp5s/
public class SmallestSumParody {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println((arr[0]+arr[1]));
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
    }
}
/*
Problem Statement
You are given an array A of size N. Find the smallest sum of any two numbers (on distinct indices) possible in the array,
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
2 <= N <= 105
1 <= Ai <= 109
Output
Print the smallest sum of any two numbers (on distinct indices) possible in the array,
Example
Sample Input:
5
5 3 8 7 2

Sample Output:
5
 */