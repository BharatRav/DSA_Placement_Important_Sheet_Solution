import java.util.HashSet;

//Link:-https://my.newtonschool.co/playground/code/u2lr8pdjqpsd/
public class BinaryStringWithSubstringsRepresenting1ToN {
    public boolean queryString(String S, int N) {
        // enter your code here.
        HashSet<String> AllSubstring = new HashSet<>();
        int len_str = S.length();
        for (int i=0;i<len_str;i++) {
            for (int j=i+1;j<=len_str;j++) {
                AllSubstring.add(S.substring(i,j));
            }
        }

        for (int i=1;i<=N;i++) {
            String binaryConversion =Integer.toBinaryString(i);
            if (!AllSubstring.contains(binaryConversion)) {
                return false;
            }
        }
        return true;

        //T(n) O(max(S.length*S.length,N)
        //S(n) = O(S.length*S.length)
    }

    //Optimised Code
//    public boolean queryString(String S, int N) {
//        for (int i = 1; i <= N; i++) {
//            String binary = Integer.toBinaryString(i);
//            if (!S.contains(binary)) {
//                return false;
//            }
//        }
//        return true;
//    T(n) = O(nlogn) due to .tobinryString method
//    S(n)  = O(1)
//    }

}
/*
Problem Statement
Given a binary string s and a positive integer n, return true if the binary representation of all the integers in the range [1, n] are substrings of s, or false otherwise.

A substring is a contiguous sequence of characters within a string.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function queryString() that takes string "s" and Integer "n" as parameters.

Constraints:
1 ≤ s.length ≤ 1000
s[i] is either '0' or '1'.
1 ≤ n ≤ 109
Output
Return true if the binary representation of all the integers in the range [1, n] are substrings of s, or false otherwise.
Example
Sample 1:
Input: s = "0110", n = 3
Output: true

Sample 2:
Input: s = "0110", n = 4
Output: false
 */