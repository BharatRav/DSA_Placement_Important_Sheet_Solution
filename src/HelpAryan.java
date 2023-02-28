import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/i4lofybeu5o4/
public class HelpAryan {
    public static void main (String[] args) {
        // Your code here

        //if you like it plz give a start to this repo
        Scanner sc = new Scanner(System.in);
        String str =sc.next();
        int[] ASCII = new int[26];
        for (int i=0;i<str.length();i++) {
            ASCII[str.charAt(i)-'a']++;
        }
        for (int i=0;i<str.length();i++) {
            if(ASCII[str.charAt(i)-'a']>1) {
                System.out.print(str.charAt(i)+" ");
                break;
            }
        }
        for (int i=str.length()-1;i>=0;i--) {
            if(ASCII[str.charAt(i)-'a']>1) {
                System.out.print(str.charAt(i)+" ");
                break;
            }
        }
    }
}
/*
Problem Statement
    Aryan was given a string, He was asked to print the first and last repeated character in a string.

Input
    The first line of the input contains a string str.

Constraints
    1 ≤ |str| ≤ 105

Output
    Print the first and last repeated character of a string.
    Example
    Sample Input
        newtonschool

    Sample Output
        n o

Explanation
    The first repeated character is n as it occurs 2 times in complete string and the last repeated character is o.
 */