import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/vnidhhgluthh/
public class SumUpContest {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        long result=0;
        if(a%2!=0) {
            a++;
        }
        for (int i=a;i<=b;i+=2)  {
            int curr=i;
            while(curr%2==0) {
                result+=curr;
                curr /=2;
            }
        }
        System.out.println(result);
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
    }
}
/*
Problem Statement
Given two integers a and b. Your task is to find the sum of all the even divisors of each number from a to b inclusive.
Input
The input contains two integers a and b.

Constraints:-
1 ≤ a ≤ b ≤ 108
Output
Print the sum of even divisors.
Example
Sample Input 1:-
1 10

Sample Output 1:-
38

Sample Input 2:-
1 20

Sample Output 2:-
148

Explanation:
Even divisors for 1:- NIL
Even divisors for 2:- 2
Even divisors for 3:- NIL
Even divisors for 4:- 2, 4
Even divisors for 5:- NIL
Even divisors for 6:- 6
Even divisors for 7:- NIL
Even divisors for 8:- 2, 4, 8
Even divisors for 9:- NIL
Even divisors for 10:- 10
Total :- 2+2+4+6+2+4+8+10 = 38
 */