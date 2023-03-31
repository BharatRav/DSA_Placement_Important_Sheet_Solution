import java.util.Arrays;
//Link:-https://my.newtonschool.co/playground/code/n3qqcmhme817/
public class LargestTimeToGivenDigits {
    public String largestTimeFromDigits(int[] A) {
        // enter your code here.
        String time ="";
        Arrays.sort(A);
        int h1 =-1;
        for (int i=A.length-1;i>=0;i--) {
            if (h1<A[i] && A[i]<3) {
                h1 =A[i];
                A[i]=-1;
                break;
            }

        }
        int h2=-1;
        for (int i=A.length-1;i>=0;i--) {
            if (h2<A[i] && A[i]<4 && A[i]!=-1) {
                h2 =A[i];
                A[i]=-1;
                break;
            }

        }
        int m1=-1;
        for (int i=A.length-1;i>=0;i--) {
            if (m1<A[i] && A[i]<6 && A[i]!=-1) {
                m1 =A[i];
                A[i]=-1;
                break;
            }
        }

        int m2 = -1;
        for (int i=0;i<A.length;i++) {
            if (A[i]!=-1) {
                m2 =A[i];
                break;
            }
        }

        return time+ String.valueOf(h1)+String.valueOf(h2)+":"+String.valueOf(m1)+String.valueOf(m2);
    }
}
/*
Problem Statement
Given an array arr of 4 digits, find the latest 24- hour time that can be made using each digit exactly once.

24- hour times are formatted as "HH:MM", where HH is between 00 and 23, and MM is between 00 and 59. The earliest 24- hour time is 00:00, and the latest is 23:59.

Return the latest 24- hour time in "HH:MM" format. If no valid time can be made, return an empty string.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function largestTimeFromDigits() that takes Integer Array "arr" as parameter.

Constraints:
arr.length == 4
0 ≤ arr[i] ≤ 9
Output
Return the latest 24-hour time in "HH:MM" format. If no valid time can be made, return an empty string.

starsASK AI
BETA
Simpler Explanation
Concepts Used
Example
Sample 1:
Input:
1 2 3 4
Output:
"23:41"
Explanation: The valid 24-hour times are "12:34", "12:43", "13:24", "13:42", "14:23", "14:32", "21:34", "21:43", "23:14", and "23:41". Of these times, "23:41" is the latest.

Sample 2:
Input:
5 5 5 5
Output:
""
Explanation: There are no valid 24-hour times as "55:55" is not valid.
Generate Expected Output

2 3 6 0
23"06
 */