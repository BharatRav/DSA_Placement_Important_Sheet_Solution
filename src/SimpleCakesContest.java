import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Link:-https://my.newtonschool.co/playground/code/rlss9ulr5uwn/
public class SimpleCakesContest {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        for (int i=0;i<n;i++) {
            set.add(sc.nextInt());
        }
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
        System.out.println(set.size());
    }
}
/*
Problem Statement
You have bought N cakes and the ith cake has A[i] level of sweetness. Now you want to display the cakes in exhibition but there is a condition that you cannot display two cakes with same sweetness level. Find the maximum number of cakes that you can display.
Input
The first line of input contains a single integer N.
Second line contains N space seperated integers A[1], A[2] ..... A[N]

Constraints :
1 <= N <= 100000
1 <= A[i] <= 100000
Output
Output a single integer denoting the maximum number of cakes you can display.
Example
Sample input 1
5
1 2 3 4 5

Sample output 1
5

Sample input 2
4
1 2 2 3

Sample output 2
3

Explanation:-
Test Case 2:- There are 2 cakes with sweetness level 2 as per rule only one of them can be displayed so the ans is 3
 */
