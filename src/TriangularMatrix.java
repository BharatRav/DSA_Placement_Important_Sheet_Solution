import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/kpm8b0hf3805/
public class TriangularMatrix {
    public static void main (String[] args) {
        // Your code here
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        long upperSum=0,lowerSum=0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (i==j) {
                    upperSum+=arr[i][j];
                    lowerSum+=arr[i][j];
                } else if (i<j) {
                    upperSum+=arr[i][j];
                } else {
                    lowerSum+=arr[i][j];
                }
            }

            //if you like it plz give a star to the repository
            //it'll motivate us to do more question
            //http://github.com/bharatrav
        }
        System.out.println(upperSum+" "+lowerSum);
    }
}
/*
Problem Statement
Given a matrix of size N*N, your task is to find the sum of the upper triangular matrix and the lower triangular matrix.

For Matrix:-
M00 M01 M02
M10 M11 M12
M20 M21 M22

Upper Triangular:-
M00 M01 M02
_____M11 M12
__________M22

Lower Triangular:-
M00__________
M10 M11_____
M20 M21 M22
Input
The first line of input contains a single integer N, The next N lines of input contains N space- separated integers depicting the values of the matrix.

Constraints:-
1 <= N <= 500
1 <= Matrix[][] <= 100000
Output
Print the sum of Upper and Lower Triangular Matrix separated by a space.
Example
Sample Input:-
2
1 4
2 6

Sample Output:-
11 9

Sample Input:-
3
1 4 2
1 5 7
3 8 1

Sample Output:-
20 19
 */
