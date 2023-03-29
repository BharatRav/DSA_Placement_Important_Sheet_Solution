import java.util.HashMap;
import java.util.Map;

//Link:-https://my.newtonschool.co/playground/code/h8tnmtlar2mx/
public class FractionToRecurringDecimal {
    public String fractionToDecimal(int num, int den) {
        // enter your code here.
        // enter your code here.
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav


        if (num==0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        if (num<0 ^ den <0) {
            sb.append("-");
        }

        long n = Math.abs((long) num);
        long d = Math.abs((long) den);

        sb.append(num/den);
        long rem = num%den;

        if (rem==0) {
            return sb.toString();
        }

        sb.append(".");
        Map<Long,Integer> map = new HashMap<>();
        while (rem!=0) {
            if (map.containsKey(rem)) {
                int idx = map.get(rem);
                sb.insert(idx,"(");
                sb.append(")");
                break;
            }
            map.put(rem,sb.length());
            rem*=10;
            sb.append(rem/den);
            rem%=den;
        }
        return sb.toString();
    }
}
/*
Problem Statement
Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

If the fractional part is repeating, enclose the repeating part in parentheses.

It is guaranteed that the length of the answer string is less than 104 for all the given inputs.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function fractionToDecimal() that takes two Integers "numerator" and "denominator" as parameters.

Constraints:
0 ≤ numerator, denominator ≤ 231 - 1
denominator != 0
Output
Return the answer string.
starsASK AI
BETA
Simpler Explanation
Concepts Used
Example
Sample 1:
Input: numerator = 1, denominator = 2
Output: "0.5"

Sample 2:
Input: numerator = 2, denominator = 1
Output: "2"

Sample 3:
Input: numerator = 4, denominator = 333
Output: "0.(012)"
 */
