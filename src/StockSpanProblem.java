import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
//Link:-https://my.newtonschool.co/playground/code/yar5b1sqb88h/
public class StockSpanProblem {
    public static void main (String[] args) throws IOException {
        // Your code here
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());

        int[] stockPrice = new int[n];
        String[] stocks = sc.readLine().split(" ");
        for (int i=0;i<n;i++) {
            stockPrice[i] = Integer.parseInt(stocks[i]);
        }
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav

        // for (int i=0;i<n;i++) {
        //     int count=1;
        //     for (int j=i-1;j>=0;j--) {
        //         if (stockPrice[i]<stockPrice[j]) {
        //             break;
        //         }
        //         count++;
        //     }
        //     System.out.print(count+" ");
        // }
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<n;i++) {
            // if (stack.isEmpty()) {
            //     stack.push(stockPrice[i]);
            //     System.out.print(stack.size()+" ");
            //     continue;
            // }
            while (!stack.isEmpty() && stockPrice[stack.peek()] <=stockPrice[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                System.out.print((i+1)+" ");
            } else {
                System.out.print((i-stack.peek())+" ");
            }
            stack.push(i);
        }
    }
}
/*
Problem Statement
The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate the span of stock’s price for all n days.
The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day(including), for which the price of the stock on the current day is less than or equal to its price on the given day.
For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}.

Explanation to the given example:
On 0th day only the current day where we find that stock price is less than or equal to it so for 1 consecutive day(current day) this happens.
On 1st day only the current day where we find that stock price is less than or equal to it so for 1 consecutive day(current day) this happens.
On 2nd day only the current day where we find that stock price is less than or equal to it so for 1 consecutive day(current day) this happens.
Now on 3rd day we observe that stock price for last two consecutive days is less than or equal to current day i.e. (60, 70) thus count is 2
On 4th day only the current day where we find that stock price is less than or equal to it so for 1 consecutive day(current day) this happens.
On 5th day we observe that stock price for last four consecutive days is less than or equal to current day i.e. (60, 70, 60, 75) thus count is 4.
On 6th day we observe that stock price for last six consecutive days is less than or equal to current day i.e. (80, 60, 70, 60, 75, 85) thus count is 6.
Input
The first line of each test case is N, N is the size of the array. The second line of each test case contains N input A[i].

1 ≤ N ≤ 100000
1 ≤ A[i] ≤ 100000
Output
For each test case, print the span values for all days.
Example
Input
7
100 80 60 70 60 75 85

Output
1 1 1 2 1 4 6

Input
6
10 4 5 90 120 80

Output
1 1 2 4 5 1

Explanation:
Test case 1:
On 0th day only the current day where we find that stock price is less than or equal to it so for 1 consecutive day(current day) this happens.
On 1st day only the current day where we find that stock price is less than or equal to it so for 1 consecutive day(current day) this happens.
On 2nd day only the current day where we find that stock price is less than or equal to it so for 1 consecutive day(current day) this happens.
Now on 3rd day we observe that stock price for last two consecutive days is less than or equal to current day i.e. (60, 70) thus count is 2
On 4th day only the current day where we find that stock price is less than or equal to it so for 1 consecutive day(current day) this happens.
On 5th day we observe that stock price for last four consecutive days is less than or equal to current day i.e. (60, 70, 60, 75) thus count is 4.
On 6th day we observe that stock price for last six consecutive days is less than or equal to current day i.e. (80, 60, 70, 60, 75, 85) thus count is 6.
 */