import java.util.Arrays;
import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/eqgi8w7knqhh/
public class ModSquare {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }

        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav

        Arrays.sort(arr);
        int i = n-2;
        while(i>=0 && arr[i]==arr[n-1]) {
            i--;
        }
        System.out.println(arr[i]%arr[n-1]);
    }
}
/*
Problem Statement
You are given an array P of size N. You have to find the maximum value of Pi % Pj for all possible i, j pairs.
Input
First line contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
2 <= N <= 105
1 <= Pi <= 109
Output
Print the maximum value of Pi % Pj for all possible i, j pairs in the array.
Example
Sample Input:
5
8 6 7 9 4

Sample Output:
8

Explanation:
i = 1, j = 4 (1-based indexing) will give the maximum possible result over all (i, j) pairs.
 */