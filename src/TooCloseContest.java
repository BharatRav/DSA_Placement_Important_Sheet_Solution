import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
//Link:-https://my.newtonschool.co/playground/code/ad1nxrhpg8oq/
public class TooCloseContest {
    public static void main (String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        TreeSet<Integer> tset = new TreeSet<>();

        for (int i=0;i<n;i++) {
            int data= sc.nextInt();
            tset.add(data);
        }
        System.out.println(getOutput(tset, k));
    }
    private static int getOutput(TreeSet<Integer> tset, int k){
        if(!tset.contains(k)) {
            return k;
        }
        int higher =tset.higher(k);
        int lower =tset.lower(k);

        int min=k;
        while (lower<higher) {
            if (tset.contains(lower)) {
                lower++;
                continue;
            }
            min =Math.min(min,Math.abs(k-lower));
        }
        return min;
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
    }
}
/*
Problem Statement
You are given an array A of size N. You need to find the integer not present in this array that is closest to K. The closeness between two numbers A[i] and A[j] is defined as abs(A[i] - A[j]).

For Example:
For given array A = [1,2,5,6,13]
For given K = 12
Output: 12

Explanation: numbers missing 3, 4, 7,8, 9, 10, 11, 12, 14, 15....
and K = 12, so distance from each missing number is (3,9), (4,8), ....
where every pair denotes (missing number, distance) hence 12 is answer.
Input
The first line of the input contains two integers N and K.

Constraints
1 <= N <= 1000
1 <= A[i] <= 10000
1 <= K <= 10000

(The array may not contain all distinct numbers)
Output
Output the required closest number.
Example
Sample Input
5 6
4 7 10 6 5

Sample Output
8

Explanation: Closeness of 8 is 2. There is no such number that has closeness lesser than this and is not a part of array.

Sample Input
5 10
4 7 10 6 5

Sample Output
9
 */