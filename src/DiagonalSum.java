import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        long primary=0,secondary=0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                int data=sc.nextInt();
                if (i==j) {
                    primary+=data;
                }
                if (i==(n-j-1)) {
                    secondary+=data;
                }
            }
        }
        System.out.print(primary+" "+secondary);
    }
}
/*
[problem statement

Problem Statement
Given a matrix of size N*N, your task is to find the sum of the primary and secondary diagonal of the matrix.

For Matrix:-
M00 M01 M02
M10 M11 M12
M20 M21 M22

Primary diagonal:- M00 M11 M22
Secondary diagonal:- M02 M11 M20
Input
The first line of input contains a single integer N, The next N lines of input contains N space-separated integers depicting the values of the matrix.

Constraints:-
1 <= N <= 500
1 <= Matrix[][] <= 100000
Output
Print the sum of primary and secondary diagonal separated by a space.
Example
Sample Input:-
2
1 4
2 6

Sample Output:-
7 6

Sample Input:-
3
1 4 2
1 5 7
3 8 1

Sample Output:-
7 10
 */