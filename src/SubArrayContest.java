import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/agkmqsrjkbys/
public class SubArrayContest {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] A= new int[n];
        for (int i=0;i<n;i++) {
            A[i] = sc.nextInt();
        }

        int[] B= new int[m];
        for (int i=0;i<m;i++) {
            B[i] = sc.nextInt();
        }

        int result=m;
        for (int i=0;i<=n-m;i++) {
            int count=0;
            for (int j=0;j<m;j++) {
                if(B[j]!=A[i+j]) {
                    count++;
                }
            }
            result= Math.min(result,count);
        }
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
        System.out.println(result);
    }
}
/*
Problem Statement
You are given two integer arrays A and B of sizes N and M respectively. You need to modify the elements of A so that B becomes its subarray. Modifying an element means change the element to any other value.

Find the minimum number of modifications to achieve this.
Input
The first line of the input contains two integers N and M.
The second line of the input contains N space separated integers, the elements of array A.
The third line of the input contains M space separated integers, the elements of array B.

Constraints
1 <= M <= N <= 500
1 <= A[i], B[i] <= 10
Output
Output a single integer, the minimum number of modifications in A to make B its subarray.
Example
Sample Input
6 3
3 1 2 1 3 3
1 2 3

Sample Output
1

Explanation: If you modify A[4] from 1 to 3. A[2]. A[4] represents the array B, so B is its subarray.

Sample Input
10 5
3 4 5 3 4 3 1 3 5 2
1 4 4 4 3

Sample Output
3
 */
