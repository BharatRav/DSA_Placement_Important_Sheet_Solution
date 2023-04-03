//Link:-https://my.newtonschool.co/playground/code/jkflo6ccaipo/
public class DecodeStringAtIndex {
    public String decodeAtIndex(String S, int K) {
        long curLength = 0;
        char c = 0;

        for (int i = 0; i < S.length(); i++) {
            c = S.charAt(i);
            if (Character.isDigit(c)) { // a1
                curLength *= c - '0';
            }
            else { // b1
                curLength++;
            }
        }

        for (int i = S.length() - 1; i >= 0; i--) {
            c = S.charAt(i);
            if (Character.isDigit(c)) { // a2
                curLength /= c - '0';
                K %= curLength;
            }
            else { // b2
                if (K == 0 || K == curLength) {
                    return "" + c;
                }
                curLength--;
            }
        }

        throw null;
    }
    // ham,ham,a hamham  a,hamham a,hamham a
// Boolean flag = Character.isDigit(str.charAt(i));
// Character.isAlphabetic(c)
}

/*
Problem Statement
You are given an encoded string s. To decode the string to a tape, the encoded string is read one character at a time and the following steps are taken:

:> If the character read is a letter, that letter is written onto the tape.
:> If the character read is a digit d, the entire current tape is repeatedly written d - 1 more times in total.

Given an integer k, return the kth letter (1- indexed) in the decoded string.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function decodeAtIndex() that takes string "s" and Integer "k" as parameters.

Constraints:
2 ≤ s.length ≤ 100
s consists of lowercase English letters and digits 2 through 9.
s starts with a letter.
1 ≤ k ≤ 109
It is guaranteed that k is less than or equal to the length of the decoded string.
The decoded string is guaranteed to have less than 263 letters.
Output
Given an integer k, return the kth letter (1-indexed) in the decoded string.
ai_logoASK NEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample 1:
Input:
ha22
5
Output:
h
Explanation: The decoded string is "hahahaha".
The 5th letter is "h".

Sample 2:
Input:
a2345678999999999999999
1
Output:
a
Explanation: The decoded string is "a" repeated 8301530446056247680 times.
The 1st letter is "a".
 */
