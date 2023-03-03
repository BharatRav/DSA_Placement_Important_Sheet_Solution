import java.util.Arrays;
import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/sfaa7zjjtatc/
public class MonsterCombatContest {
    public static void main (String[] args) {
        // Your code here
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0;i<n;i++ ){
            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);
        int killed=0;
        for (int killer=1; killer<n;killer++) {
            if (arr[killer]>arr[killed]) {
                killed++;
            }
        }

        System.out.println(n-killed);
    }
}
/*
Problem Statement
There are N monsters, the ith of them having strength Pi. A monster i can eat monster j if and only if all of the following conditions are true:

Strength of monster i is strictly more than monster j. More formally, Pi > Pj.

Monster j has not already been eaten.

Monster i has not already eaten some other monster.


More formally, each monster can eat at most one other monster. Furthermore, each monster can be eaten by at most one monster.
All the N monsters are pushed together into an arena. Find the minimum number of remaining live monsters possible after an infinite amount of time.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
1 ≤ N ≤ 105
1 ≤ Pi ≤ 105
Output
Print the maximum number of remaining live monsters possible after an infinite amount of time.
Example
Sample Input:
4
3 1 2 4

Sample Output:
1

Explaination:
Monster 3 will eat monster 2.
Monster 1 will eat monster 3.
Monster 4 will eat monster 1.
Only monster 4 will remain alive at the end.
 */