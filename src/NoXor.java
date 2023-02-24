import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NoXor {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=  new Scanner(System.in);
        int n=sc.nextInt();
        long res =0;    //initially

        for (int i=1;i<=n;i++) {
            int data =sc.nextInt();
            res+=((n-i)^data);
        }
        System.out.println(res);
    }
}

//plz give a star to the repo and follow me github.com/bharatrav
/*
Problem Statement
    We need a problem on xor again. Given an array A of N integers (1- indexed), you need to find the sum of (N- i) xor A[i] for all i from 1 to N.

Input
    The first line of the input contains an integer N, the number of elements of the array.
    The second line of the input contains N singly spaced integers of the array A[i].

Constraints:
1 ≤ N ≤ 105
1 ≤ A[i] ≤ 109
Output
Output a single integer, the answer to the problem.
Example
Sample Input
5
1 2 3 4 5

Sample Output
17

Explanation
(5-1)xor1 = 5, (5-2)xor2 = 1, (5-3)xor3 = 1, (5-4)xor4 = 5, (5-5)xor5 = 5.

Sample Input
5
1 1 0 4 6

Sample Output
20
 */
