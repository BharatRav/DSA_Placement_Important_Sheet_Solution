import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/37nb0ibp0a56/
public class MaximumFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] freq = new int[26]; // to store the frequency of each letter
        int maxFreq = 0; // to store the maximum frequency
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
            maxFreq = Math.max(maxFreq, freq[c - 'a']);
        }
        char ans = '?'; // to store the answer
        for (int i = 0; i < 26; i++) {
            if (freq[i] == maxFreq) {
                if (ans != '?') {
                    ans = '?'; // multiple characters have the same frequency, so set ans to -1
                    break;
                } else {
                    ans = (char) (i + 'a'); // update ans to the current character
                }
            }
        }
        if (ans =='?') {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
    }
}
/*
Problem Statement
You are given a string S of length N. Find the character which occurs the most number of times in this string. If there are mutliple such characters present, print -1.
Input
The first line of the input contains a single integer N.
The second line of the input contains a string S.

Constraints:
2 ≤ N ≤ 105
All characters in string S are lowercase english letters.
Output
Print the character which occurs the most number of times in this string. If there are mutliple such characters present, print -1.
Example
Sample Input:
7
abadcar

Sample Output:
a

 */