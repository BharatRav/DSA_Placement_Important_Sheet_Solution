import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//Link:-https://my.newtonschool.co/playground/code/2k06pmax9u55/
public class SmallestSubsequenceOfDistinctCharacters {
    public String smallestSubsequence(String S) {
        // enter your code here.
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
        Map<Character,Integer> lastOccurence = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        int len =S.length();
        for (int i=0;i<len;i++) {
            lastOccurence.put(S.charAt(i),i);
        }

        for (int i=0;i<len;i++) {
            char ch = S.charAt(i);
            if (stack.contains(ch)) {
                continue;
            }

            while (!stack.isEmpty() && stack.peek()>ch && i< lastOccurence.get(stack.peek())) {
                stack.pop();
            }
            stack.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch:stack){
            sb.append(ch);
        }

        return sb.toString();
    }
}
/*
Problem Statement
Given a string s, return the lexicographically smallest subsequence of s that contains all the distinct characters of s exactly once.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function smallestSubsequence() that takes string "s" as parameter.

Constraints:
1 ≤ s.length ≤ 1000
s consists of lowercase English letters.
Output
Return the lexicographically smallest subsequence of s that contains all the distinct characters of s exactly once.
starsASK AI
BETA
Simpler Explanation
Concepts Used
Example
Sample 1:
Input: s = "bcabc"
Output: "abc"

Sample 2:
Input: s = "cbacdcbc"
Output: "acdb"
 */