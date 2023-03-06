import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/cy2prnkm72sw/
public class CanWeSortContest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc .nextInt();

        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("YES");
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
    }
}
/*
Problem Statement
Bob was working on a new algorithm to make an array non-decreasing. he came up with the following algorithm :

For an array a of size n
Step 1: Select two indexes i and j, 0 ≤ i < j < n.
Step 2: if a[i] + a[j] is odd then do a[i] = a[j]
if a[i] + a[j] is even then do a[j] = a[i]
Step 3: Repeat steps 1 and 2 until the array is non-decreasing.

Bob is not sure about his algorithm, he asks you if it is possible to make the given array non-decreasing using the mentioned algorithm.
Input
The first line contains n.
The next line contains n space-separated integers.

Constraints
1 ≤ n ≤ 105
1 ≤ a[i] ≤ 109
Output
Print "YES" of it is possible to make array non- decreasing, otherwise print "NO".
Example
Input:
4
3 2 5 3

Output:
YES

Explanation:
(i, j) => (0, 1) => 3+2 = 5 => odd => a[0] = a[1] => a[0] = 2
(i, j) => (2, 3) => 5+3 = 8 => even=> a[3]= a[2] => a[3] = 5
final aray => 2 2 5 5
 */
