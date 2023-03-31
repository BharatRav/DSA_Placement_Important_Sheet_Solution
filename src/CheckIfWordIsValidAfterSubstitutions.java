//Link:-https://my.newtonschool.co/playground/code/w04zuj7o5rab/
public class CheckIfWordIsValidAfterSubstitutions {
    public boolean isValid(String S) {
        String abc = "abc";

        while(S.contains(abc)) {
            S = S.replace(abc, "");
        }

        return S.isEmpty();
    }
}
/*
Problem Statement
Given a string s, determine if it is valid.

A string s is valid if, starting with an empty string t = "", you can transform t into s after performing the following operation any number of times:

:> Insert string "abc" into any position in t. More formally, t becomes tleft + "abc" + tright, where t == tleft + tright. Note that tleft and tright may be empty.

Return true if s is a valid string, otherwise, return false.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function isValid() that takes String "s" as parameter.

Constraints:
1 ≤ s.length ≤ 2x104
s consists of letters 'a', 'b', and 'c'
Output
Return true if s is a valid string, otherwise, return false.

ai_logoASK NEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample 1:
Input: s = "aabcbc"
Output: true
Explanation:
"" -> "abc" -> "aabcbc"
Thus, "aabcbc" is valid.

Sample 2:
Input: s = "abcabcababcc"
Output: true
Explanation:
"" -> "abc" -> "abcabc" -> "abcabcabc" -> "abcabcababcc"
Thus, "abcabcababcc" is valid.

Sample 3:
Input: s = "abccba"
Output: false
Explanation: It is impossible to get "abccba" using the operation.
 */