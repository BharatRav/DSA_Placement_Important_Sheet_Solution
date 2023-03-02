import java.util.Arrays;
import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/etgwyf9o9915/
public class MaxCandies1st {
    //i recommend first check that you r on right queestion ornot because their is 2 questions having same name,
    //i have write down problem statement at the bottom

    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int[][] arr = new int[2][n];

        for (int i=0;i<2;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.println(getResult(arr,n));
    }
    //if you like it plz give a star to the repository
    //it'll motivate us to do more question
    //http://github.com/bharatrav
    private  static  int getResult(int[][] candies, int n) {
        //dp approach

        int[][] dp= new int[2+1][n+1];

        for (int i=1;i<=2;i++) {
            for (int j=1;j<=n;j++) {
                dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1])+candies[i-1][j-1];
            }
        }
        return dp[2][n];
    }
}
/*
Problem Statement
Given a 2*N matrix in which each cell contains some candies in it. You are at the top left corner of the matrix and want to reach the bottom right corner of the matrix i. e from (1, 1) to (2, N). You can only move right or down. You have to find the maximum number of candies you can collect in your journey.
Input
The first line of input contains a single integer N. The second line of input contains N spaces separated integers. The last line of input contains N space-separated integers.

Constraints:-
2 <= N <= 10000
1 <= Matrix[i][j] <= 100000
Output
Print the maximum amount of candies you can have at the end of your journey.
Example
Sample Input 1:-
5
1 3 5 6 2
2 4 8 4 2

Sample Output 1:-
23

Sample Input 2:-
4
1 1 1 1
1 1 1 1

Sample Output 2:-
5
 */
