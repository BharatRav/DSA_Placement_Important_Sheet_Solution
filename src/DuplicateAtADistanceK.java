import java.util.Scanner;

//Link:-https://my.newtonschool.co/playground/code/gczz7eufltjh/
public class DuplicateAtADistanceK {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean flag =false;
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav

        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n-k;i++) {
            if (arr[i] ==arr[i+k]) {
                flag=true;
                break;
            }
        }

        if(flag) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
/*
Problem Statement
Given an array of N integers that may contain duplicate elements and an integer K, find if there exists a pair of integers (i, j) such that i < j and arr[i]=arr[j] and i and j are exactly k distance apart i.e ( j - i ) = k.
Input
The first line of input contains two integers N and K, next line contains N space-separated integers.

Constraints:-
1 < = N < = 105
1 < = K < = N
1 < = Arr[i] < = 109
Output
Print 1 if there exist elements else print 0.
Example
Sample Input:
4 3
1 2 2 1

Sample Output:
1

Explanation:-
Pair at index 1, 4 is the required answer so output=1
 */
