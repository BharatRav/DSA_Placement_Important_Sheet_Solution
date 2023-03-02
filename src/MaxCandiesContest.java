import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/oulr2ppqeq7w/
public class MaxCandiesContest {
    //i recommend first check that you r on right queestion ornot because their is 2 questions having same name,
    //i have write down problem statement at the bottom
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n-1];
        long sum=0;
        for (int i=0;i<n-1;i++) {
            arr[i]= sc.nextInt();
            sum+=arr[i];
        }
        n--;

        sum = arr[0] + arr[n - 1];
        for (int i = 1; i < n; i++) {
            sum = sum + Math.min(arr[i], arr[i - 1]);
        }
        System.out.print(sum);
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
    }
}
/*
Problem Statement
There is a row of N shops. Each shop sells A[i] candies. Your friend made an array B of (N-1) integers where B[i] = max(A[i], A[i+1]) for i from 1 to (N-1). You are given array B. You want to generate the array A such that the sum of values of the candies in A is maximum. Find the maximum possible sum of candies of array A.
Input
The first line of input contains a single integer N.
The second line of input contains (N-1) integers denoting array B.

Constraints:
2 ≤ N ≤ 105
1 ≤ B[i] ≤ 109
Output
Print the maximum possible sum of the candies in array A.
Example
Sample Input
4
1 3 4

Sample Output
9

Explanation:
Optimal Array A will be [1, 1, 3, 4]
 */