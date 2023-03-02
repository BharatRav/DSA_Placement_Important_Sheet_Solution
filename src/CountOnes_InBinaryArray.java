
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
//Link:-https://my.newtonschool.co/playground/code/6v1imyuvl6xf/


// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0) {
            int n= sc.nextInt();
            int [] arr = new int[n];

            for (int i=0;i<n;i++) {
                arr[i]= sc.nextInt();
            }

            System.out.println(getResult(arr,n));
        }
    }
    //if you like it plz give a star to the repository
    //it'll motivate us to do more question
    //http://github.com/bharatrav
    private static int getResult(int[] arr , int n) {
        //as question said
        //i'm using binary search
        int  left =0, right =n-1;

        while(left<=right) {
            int mid = left+(right-left)/2;

            if (arr[mid]==1) {
                left=mid+1;
            } else {
                right=mid-1;
            }
        }
        return left;
    }
}
/*
Problem Statement
Given a binary sorted non-increasing array arr of size N. You need to print the count of 1's in the binary array.

Try to solve the problem using binary search
Input
The input line contains T, denotes the number of testcases.
Each test case contains two lines. The first line contains N (size of binary array). The second line contains N elements of binary array separated by space.

Constraints:
1 <= T <= 100
1 <= N <= 10^6
arr[i] = 0,1

Sum of N over all testcases does not exceed 10^6
Output
For each testcase in new line, print the count 1's in binary array.
Example
Input:
2
8
1 1 1 1 1 0 0 0
8
1 1 0 0 0 0 0 0

Output:
5
2

Explanation:
Testcase 1: Number of 1's in given binary array : 1 1 1 1 1 0 0 0 is 5.
Testcase 2: Number of 1's in given binary array : 1 1 0 0 0 0 0 0 is 2.
 */