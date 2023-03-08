import java.util.Arrays;
import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/9nzd1vl89osg/
public class ScienceCampContest {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n];
        for (int i=0;i<n;i++) {
            arr[i]= sc.nextLong();
        }
        Arrays.sort(arr);

        long result=0;
        long curr=0;
        int i=0,j=arr.length-1;
        long sum=arr[i]+arr[j];

        while (i<j) {
            if(arr[i]+arr[j] !=sum) {
                System.out.println(-1);
                return;
            }
            curr =arr[i++]*arr[j--];
            result+=curr;
        }
        System.out.println(result);
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
    }
}
// 1 2 3 4 5 6
// 6 10 12
// 12 12 5 29
// 28

// 3 5 6 9
// 27 30
// 57


/*
Problem Statement
There are N students in the science camp. The ith of those students has an intelligence of di. The instructor wants to group each student into a pair 2 wherein each student is present in exactly one group and each group has exactly 2 students in it. Furthermore, he wants the sum of intelligence in each group to be the same. The efficiency of a group having students i and j are defined as di*dj. Find the sum of the efficiencies of all the groups in the science camp.
If such a distribution is not possible, print -1.
Input
The first line of the input contains a single integer N.
The second line contains N space-separated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 106
It is given that N is always even.
Output
Print the sum of the efficiencies of all the groups in the science camp.
If a legit distribution of students is not possible, print -1.
Example
Sample Input1:
6
4 5 3 6 1 2

Sample Output1:
28

Sample Input2:
4
5 3 9 6

Sample Output2:
-1

Explaination1:
We can divide groups of students like:
[3, 4] Efficiency = 3*4 = 12
[2, 5] Efficiency = 2*5 = 10
[1, 6] Efficiency = 1*6 = 6
Total efficiency = 12 + 10 + 6 = 28
 */