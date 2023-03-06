import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/1g5yeezgirz9
public class DigitsPrinting {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result =n%100;

        System.out.println(result<10 ?("0"+n%100):n%100);
    }
}
/*
Problem Statement
You are given an integer N of at least 100. Print the last two digits of N. Strictly speaking, print the tens and one's digits of N in this order.
Input
The input consists of an integer.
N

Constraints
100≤N≤999
N is an integer.
Output
Print the answer.
Example
Sample Input 1
254
Sample Output 1
54

Sample Input 2
101
Sample Output 2
01
 */
