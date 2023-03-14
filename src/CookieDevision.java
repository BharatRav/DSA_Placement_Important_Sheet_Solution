import java.util.Scanner;

//Link:-https://my.newtonschool.co/playground/code/buoojzu1ng3z/
public class CookieDevision {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        long sum=0;
        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
            sum+=arr[i];
        }

        if(sum%2!=0) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav

    }
}
/*
Problem Statement
There are N bags of cookies, the ith bag having Ai cookies. Is there any way to divide the bags into two stacks such that both the stacks have even number of cookies. Provided that you can't open a bag and each bag has to be in exactly one stack.
Input
The first line of the input contains a single integer N.
The second line contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 109
Output
Print "YES" if there is a way to divide cookies so that each stack contains even number of cookies, else print "NO", without the quotes.
Example
Sample Input:
5
6 8 2 1 3

Sample Output:
YES
 */