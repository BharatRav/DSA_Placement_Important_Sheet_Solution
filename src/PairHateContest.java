import java.util.Scanner;
import java.util.Stack;

//Link:-https://my.newtonschool.co/playground/code/qtqqikzkt6nu/
public class PairHateContest {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Stack<Character> st = new Stack<>();

        int n = str.length();
        for (int i=0;i<n;i++) {
            char ch = str.charAt(i);

            if (!st.isEmpty() && st.peek()==ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()) {
            sb.append(st.pop());
        }

        System.out.println(sb.reverse().toString());
    }
}
/*
Problem Statement
Given a string S you have to remove all pairs of identical letters, which are consecutive. If after the removal there appear new pairs, remove them as well. Repeat this untill no adjacent letter in the string is same.
Note that deleting of the consecutive identical letters can be done in any order, as any order leads to the same result.
Input
The input data consists of a single string S.

Constraints:
1 <= |S| <= 100000
S contains lowercase english letters only.
Output
Print the given string after it is processed. It is guaranteed that the result will contain at least one character.
Example
Sample Input
hhoowaaaareyyoouu

Sample Output
wre

Explanation:
First we remove "hh" then "oo" then "aa" then "yy" then "oo" then "uu" and we are left with "wre".
Now we cannot remove anything.

Sample Input:-
abcde

Sample Output:-
abcde

Sample Input:-
abcddcb

Sample Output:-
a
 */