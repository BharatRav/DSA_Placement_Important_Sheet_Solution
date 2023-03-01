import java.util.Scanner;

//Link:-https://my.newtonschool.co/playground/code/w775naueq4nc/
public class GCDSubArrayGame {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }

        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
        int result = arr[0];

        for (int i=1;i<n;i++){
            result = findGCD(result,arr[i]);
        }

        if (result ==1) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    private static int findGCD(int a, int b) {
        if (a==0) {
            return b;
        }
        return findGCD(b%a,a);
    }
}
/*
Problem Statement
You are given an array A of size N. Find if there is any subarray in the array whose GCD is equal to 1.
Input
The first line of the input contains a single integer N.
The second line contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 109
Output
Print "YES" if there is any subarray in the array whose GCD is equal to 1, else print "NO", without the quotes.
Example
Sample Input:
5
6 2 5 3 1

Sample Output:
YES
 */
