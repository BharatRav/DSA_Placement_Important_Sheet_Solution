import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Link:-https://my.newtonschool.co/playground/code/60w53t1c0xrx/
public class KthSmallestElement {
    public static void main (String[] args) throws IOException {
        // Your code here
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc= Integer.parseInt(br.readLine());
        // System.out.println(tc);
        while (tc-->0) {
            String[] line1 = br.readLine().split(" ");
            int n= Integer.parseInt(line1[0]);
            int k= Integer.parseInt(line1[1]);
            String[] line2 = br.readLine().split(" ");
            int[] arr = new int[n];

            for (int i=0;i<n;i++) {
                arr[i]=Integer.parseInt(line2[i]);
            }

            Arrays.sort(arr);
            //if you like it plz give a star to the repository
            //it'll motivate us to do more question
            //http://github.com/bharatrav

            System.out.println(arr[k-1]);
        }
        br.close();
    }
}
/*
Problem Statement
Given an array arr[] and a number K where K is not greater than the size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Note:
Do Not Use sort() STL function, Use heap data structure.
Input
The input line contains T, denoting the number of test cases. Each test case consists of two lines. The first line of each test case contains two integers N and K. Second-line contains N space-separated integer denoting elements of the array.

Constraints:
1 <= T <= 50
1 <= N <= 10000
1 <= K <= N
1 <= arr[i] <= 106
Output
Corresponding to each test case, print the kth smallest element in a new line.
Example
Sample Input
1
6 3
7 10 4 3 20 15

Sample Output
7

Explanation:
Sorted array: 3 4 7 10 15 20, 7 is the third element
 */