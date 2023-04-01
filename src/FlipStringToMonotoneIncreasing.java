//Link:-https://my.newtonschool.co/playground/code/ub031742re3x/
public class FlipStringToMonotoneIncreasing {
    public int minFlipsMonoIncr(String s) {
//        if (s==null || s.length()==0) return 0;

        int flipCount=0;        //how many zeroes we have to convert to 1
        int oneCount =0;

        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '0') {
                if (oneCount==0) {
                    continue;
                }
                flipCount++;
            } else {
                oneCount++;
            }

            if (flipCount>oneCount) {
                flipCount=oneCount;
            }
        }
        return flipCount;
    }
}
/*
Problem Statement
A binary string is monotone increasing if it consists of some number of 0's (possibly none), followed by some number of 1's (also possibly none).

You are given a binary string s. You can flip s[i] changing it from 0 to 1 or from 1 to 0.

Return the minimum number of flips to make s monotone increasing.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function minFlipsMonoIncr() that takes string "s" as parameter.

Constraints:
1 ≤ s.length ≤ 105
s[i] is either '0' or '1'.
Output
Return the minimum number of flips to make s monotone increasing.

ai_logoASK NEWTON AI
BETA
Simpler Explanation
Concepts Used
Example
Sample 1:
Input: s = "00110"
Output: 1
Explanation: We flip the last digit to get 00111.

Sample 2:
Input: s = "010110"
Output: 2
Explanation: We flip to get 011111, or alternatively 000111.

Sample 3:
Input: s = "00011000"
Output: 2
Explanation: We flip to get 00000000.
 */