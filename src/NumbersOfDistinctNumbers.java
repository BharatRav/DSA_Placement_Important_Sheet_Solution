import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/5549wpxvj04t/
public class NumbersOfDistinctNumbers {
    private static int NumberOfDistinctNumbers(int num, int steps) {
        HashSet<Integer> set = new HashSet<>();

        Queue<Integer> queue= new LinkedList<>();
        queue.add(num);

        int count=1; // because first number is unique;
        set.add(num);
        while (!queue.isEmpty() && steps>0) {
            int size=queue.size();

            for (int i=0;i<size && steps>0;i++) {
                int temp = queue.poll();
                if (!set.contains(temp-3)) {
                    set.add(temp-3);
                    count++;
                }
                if (!set.contains(temp+3)) {
                    count++;
                    set.add(temp+3);
                }
                if (!set.contains(temp*2)) {
                    count++;
                    set.add(temp*2);
                }
                queue.add(temp-3);
                queue.add(temp+3);
                queue.add(temp*2);
                // System.out.println(queue);
            }
            steps--;


        }
        return count;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while(tc-->0) {
            int a = sc.nextInt();
            int b= sc.nextInt();
            System.out.println(NumberOfDistinctNumbers(a,b));
        }
    }

    //Method 2
    /*
    static void findAllUniq(long a, long b, HashSet<Long> hs) {
        hs.add(a);
        if (b == 0) return;
        findAllUniq(a + 3, b - 1, hs);
        findAllUniq(a - 3, b - 1, hs);
        findAllUniq(a * 2, b - 1, hs);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            HashSet<Long> hs = new HashSet<>();
            findAllUniq(a, b, hs);
            System.out.println(hs.size());
        }
    }
     */
}
/*
Problem Statement
You are given 2 numbers a, b.

You an perform at most b steps

In one step :
1- increase a by 3
2- decrease a by 3
3- multiply a by 2

Find number of distinct numbers we can make after performing at most b operations on a.
Input
The first line contains the number of tests T.

For each test case:
Input two integers a and b.

0 < T <= 100
1 <= a <= 100000
1 <= b <= 9
Output
Print answer on a separate line for each test case
Example
Sample Input
2
5 1
30 2

Sample Output
4
11

For test 1:-
In 0 steps, 5 can be formed
In 1 steps 2, 8, 10 can be formed

For test 2:-
in 0 step :- 30
in 1 step- 27 33 60
in 2 step:- 24, 30, 54, 30, 36, 66, 57 63 120

total unique number = 11
 */