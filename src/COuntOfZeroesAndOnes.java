import java.util.Scanner;

public class COuntOfZeroesAndOnes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int zero=0;
        for (int i=0;i<n;i++) {
            int data =sc.nextInt();
            if(data==0) {
                zero++;
            }
            //if you like it plz give a star to this repo
            //it'll boost our confidence to solve more question
        }
        System.out.println((n-zero)+" "+zero);
    }
}
/*
Problem Statement
Given a binary array of size N. Count number of 1's and 0's in the array.
Input
First line contains n.
Next line contains n space separated integers.

Constraints
1 <= N <= 105
0 <= arr[i] <= 1
Output
Print two integers, count of 1s and count of 0s.
Example
Input:
5
0 1 1 0 1

Output:
3 2
 */
