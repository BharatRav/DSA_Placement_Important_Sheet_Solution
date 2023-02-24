import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.*;

// don't change the name of this class
// you can add inner classes if needed
class CountingZeroesToOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int row[] = new int[n];
        int col[] = new int[n];
        long rowZero = n;
        long colZero = n;
        while (q-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            r--;
            c--;
            if (row[r] == 0) {//not striked
                row[r] = 1;
                rowZero--;
            }
            if (col[c] == 0) {
                col[c] = 1;
                colZero--;
            }
            System.out.print((rowZero * colZero) + " ");
        }
    }
}
/*
Problem Statement
You are given a square matrix of size N*N. Initially all elements of this matrix are equal to 0. You are given Q queries. Each query consists of two integers, i and j (1 <= i, j <= N) wherein you increase the value of all elements in the ith row and jth column by 1. After doing this, for each query print the number of zeroes left in the matrix.
Input
The first line of the input consists of two integers N and Q.
The next Q lines each contains two integers i and j.

Constraints:
1 <= N, Q <= 105
1 <= i, j <= N
Output
For each query print the number of zeroes left in the matrix.
Example
Sample Input:
3 3
1 1
1 2
3 2

Sample Output:
4 2 1

Explaination:
Initially, the matrix will look like:
0 0 0
0 0 0
0 0 0

After the first query, the matrix will look something like this:
1 1 1
1 0 0
1 0 0
Number of zeroes = 4

After the second query, the matrix will look something like this:
1 1 1
1 1 0
1 1 0
Number of zeroes = 2

After the third query, the matrix will look something like this:
1 1 1
1 1 0
1 1 1
Number of zeroes = 1

 */