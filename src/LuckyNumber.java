import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/xylbhqr0oq4r/
public class LuckyNumber {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        long msdSum=0,lsdSum=0;

        for (int i=0;i<n;i++) {
            msdSum+=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        for (int i=n;i<2*n;i++) {
            lsdSum+=Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        if (msdSum==lsdSum) {
            System.out.println("LUCKY");
        } else {
            System.out.println("UNLUCKY");
        }
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
    }
}
/*
Problem Statement
A 2n digits number is said to be lucky if sum of n most significant digits is equal to sum of n least significant digits.

Given a number find out if the number is lucky or not?
Input
First line contains n.
Next line contains a number of 2n digits.

Constraints
1 ≤ n ≤ 105
Number contains digits only.
Output
Print "LUCKY" if the number is lucky otherwise print "UNLUCKY".
Example
Input:
3
213411

Output:
LUCKY

Explanation :
sum of 3 most significant digits = 2 + 1 + 3 = 6
sum of 3 least significant digits = 4 + 1 + 1 = 6

Input:
1
69

Output:
UNLUCKY
 */
