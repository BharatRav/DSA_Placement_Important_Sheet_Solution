import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//List:-https://my.newtonschool.co/playground/code/3j0iu59odf3d/
public class ConcatenateStrings {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();

        List<String> str =new ArrayList<>();

        for (int i=0;i<n;i++) {
            String s = sc.next();
            str.add(s);
        }
        Collections.sort(str);

        for (String data : str) {
            System.out.print(data);
        }

        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
    }
}
/*

Problem Statement
Given N Strings of length L each. Find the lexicographically smallest string that can be formed after concatenating all the strings in some order.
Input
The first line of input contains two integers N and L. The next N lines contains a single sting each of length L.

Constraints:-
1 <= N <= 10000
1 <= L <= 20

Note:- String will contain only lowercase english letters.
Output
Print the lexicographically smallest string after concatenating all the strings in some order.
Example
Sample Input:-
3 6
newton
school
isbest

Sample Output:-
isbestnewtonschool

Sample Input:-
4 1
b
c
a
d

Sample Output:-
abcd
 */
