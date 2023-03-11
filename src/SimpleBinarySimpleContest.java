import java.util.Scanner;

//Link:-https://my.newtonschool.co/playground/code/350960rebi6c/
public class SimpleBinarySimpleContest {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int oneCount=0;
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            if (arr[i]==1) {
                oneCount++;
            }
        }
        if (oneCount!=(n/2)) {
            System.out.println(-1);
            return;
        }
        int currSum=0,count=0;
        for (int i=0;i<n;i++) {
            if (arr[i]==1) {
                currSum+=1;
            } else {
                currSum-=1;
            }

            if (currSum==0) {
                count++;
            }
        }
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav

        System.out.println(count);

    }
}
/*
Problem Statement
Given an array of N elements where each element is either 1 or 0. You have to divide the array into maximum number of subarrays such that each element of the array is in exactly one subarray such that each subarray has equal number of 1's and 0's.
Input
First line of input contains N.
Second line of input contains N space separated elements of the array.

Constraints:
1 <= N <= 100000
0 <= elements of the array <= 1
Output
Print the single integer which is the maximum number of subarrays the array can be divided into. If it is not possible then print -1.
Example
Sample input 1
4
1 0 1 0

Sample output 1
2

Sample input 2
4
1 1 0 0

Sample output 2
1
 */
