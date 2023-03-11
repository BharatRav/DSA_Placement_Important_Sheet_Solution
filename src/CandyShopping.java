import java.util.Arrays;
import java.util.Scanner;

//Link:-https://my.newtonschool.co/playground/code/qjfq54ul6ipa/
public class CandyShopping {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long m = sc.nextLong();

        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav

        int i=0;
        int count=0;
        while (i<n && m>0) {
            if (m-arr[i]==0) {
                count++;
                break;
            }
            if (m-arr[i]>0) {
                count++;
                m-= arr[i];
                i++;
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}
/*
Problem Statement
There are N candies, ith of them costing pi. You have M amount of money with you. Find the maximum number of candies you can buy.
Input
The first line of the input contains two integers N and M.
The second line of the input contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= M <= 1014
1 <= pi <= 109
Output
Print the maximum number of candies you can buy.
Example
Sample Input:
4 7
3 1 4 2

Sample Output:
3
 */