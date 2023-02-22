import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RowIndexIdentification {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();

        long max=0;
        int idx=0;
        for (int i=0;i<n;i++) {
            long currSum=0;
            for (int j=0;j<m;j++) {
                currSum+=sc.nextInt();
            }
            // System.out.println(currSum);
            if (max<currSum) {
                max =Math.max(max,currSum);
                idx=i;
            }
        }
        System.out.println(idx+1);
    }
}



/*
Question Row Index Identification

Problem Statement
    You are given a grid having N*M elements. Find the index of the row (1- indexed) which has the maximum sum of elements.
    Input
    The first line of the input contains two integers N and M.
    The next N lines each contain M space separated integers.


Constraints:
    1 <= N, M <= 103
    1 <= Ai, j <= 109


Output
    Print the index of the row (1- indexed) which has the maximum sum of elements.


Example
    Sample Input:
        4 3
        3 4 2
        5 1 7
        2 8 1
        2 3 3

    Sample Output:
        2

Explaination:
    Row number 2 has sum = 5 + 1 + 7 = 13 which is the maximum among all rows.
 */