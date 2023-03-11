
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
//Link:-https://my.newtonschool.co/playground/code/qew8addsnyah/
// don't change the name of this class
// you can add inner classes if needed
class OddBallSum {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while (sc.hasNext()) {
            int n =sc.nextInt();

            if (n%2!=0) {
                sum+=n;
            }
        }
        System.out.println(sum);
    }
}
//if you like it plz give a star to the repository
//it'll motivate us to do more question
//http://github.com/bharatrav


/*
Problem Statement
Write a function called oddball_sum which takes in a list of numbers and returns the sum of all the odd elements.
Try to solve with and without reduce function.
Input
An array containing numbers
Output
Sum of all the odd numbers in that array
Example
Sample Input:-
1 3 5 4

Sample output:-
9

Explanation-
1+3+5=9
*/
