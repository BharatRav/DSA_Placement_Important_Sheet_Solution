import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/5jkhx6t3t3mn/
public class SwappingMatrixContest {
    public static int TotalMinimumMoves(int[][] arr) {
        int x=0,y=0;
        for (int i=0;i<7;i++) {
            for (int j=0;j<7;j++) {
                if (arr[i][j]==1) {
                    x=i;
                    y=j;
                    break;
                }
            }
        }
        return Math.abs(3-x)+Math.abs(3-y);
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[7][7];

        for (int i=0;i<7;i++) {
            for (int j=0;j<7;j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav

        System.out.println(TotalMinimumMoves(arr));
    }
}
/*
Problem Statement
You are given a 7 * 7 matrix of 48 zeroes and a single 1. In one move, you can swap any two adjacent rows or columns. Find the minimum number of moves required to bring the single 1 to the middle of the matrix.
Input
The input consists of 7 lines where each line contains 7 space-separated integers.

Constraints:
48 zeroes and a single one is present in the matrix.
Output
Print the minimum number of moves required to bring the single 1 to the middle of the matrix.
Example
Sample Input:
0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 0 1 0 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0
0 0 0 0 0 0 0

Sample Output:
2
 */