import java.util.Scanner;

//Link:-https://my.newtonschool.co/playground/code/gqazbi1n6xbm/
public class CountTotalDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-->0) {
            int num=sc.nextInt();

            printResult(num);
        }
    }
    private  static  void  printResult(int num) {
        int count=0;
        if (num==0){
            System.out.println(1);
            return;
        }

        while (num!=0) {
            num/=10;
            count++;
        }
        System.out.println(count);
    }
    //if you like it plz give a star to the repository
    //it'll motivate us to do more question
    //http://github.com/bharatrav
}
/*
Problem Statement
You are given a number n. You need to find the count of digits in n.
Input
The first line of input contains T denoting the number of test cases. Each testcase contains one line of input containing n.
For Python, Language Just Completes the function.

Constraints:
1 ≤ T ≤ 100
1 ≤ n ≤ 108
Output
For each testcase, in a newline, print the count of digits in n.
Example
Input:
2
1
99999
Output:
1
5

Explanation:
Testcase 1: The number of digits in 1 is 1.
Testcase 2: The number of digits in 99999 is 5
 */
