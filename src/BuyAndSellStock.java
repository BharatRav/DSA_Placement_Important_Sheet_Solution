import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/ddyymps69nqb/
public class BuyAndSellStock {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] prices =new int[n];

        for (int i=0;i<n;i++) {
            prices[i] =sc.nextInt();
        }
        System.out.println(getMaxProfit(prices,n));
    }
    private  static  int  getMaxProfit(int[] prices, int n) {
        int count=0;
        int max =prices[n-1];
        for (int i=n-2;i>=0;i--) {
            max =Math.max(max,prices[i]);
            if (max-prices[i]>count) {
                count =max-prices[i];
            }
        }
        return count;
    }
}
/*
Problem Statement
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Print the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Input
First line contains n, denoting the number of days for transaction.
Next line contains n space separated integers denoting price on each day.

Constraints
1 <= n <= 105
0 <= prices[i] <= 109
Output
A single integer denoting the maximum profit.
Example
Input:
6
7 1 5 3 6 4

Output:
5

Explanation :
buy on 2nd day and sell on 5th day.
profit = sell - buy = 6 - 1 = 5
 */
