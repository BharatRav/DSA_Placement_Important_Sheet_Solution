import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Link:-https://my.newtonschool.co/playground/code/2fvlz55x3pp4/
public class CharacterAssassination {
    public static void main (String[] args) throws IOException {
        // Your code here
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        int n= Integer.parseInt(line1[0]);
        String str =br.readLine();
        br.close();

        char ch= line1[1].charAt(0);

        StringBuilder sb = new StringBuilder(str);
        int deletingIndex=0;
        for (int i=0;i<n;i++, deletingIndex++) {
            if (str.charAt(i)==ch) {
                sb.deleteCharAt(deletingIndex--);
            }
        }
        System.out.println(sb);

    }
}

/*
Problem Statement
You are given a string S of length N. Along with that you are also given a character c. Find the string S after removing all occurences of character c from the string.
Input
The first line of the input contains a single integer N and a character c.
The second line of the input contains string S.

Constraints:
1 <= N <= 105
All characters in string S are loweracse english alphabets.
Output
Print the string S after removing all occurences of character c from the string.
Example
Sample Input:
5 e
becde

Sample Output:
bcd

 */