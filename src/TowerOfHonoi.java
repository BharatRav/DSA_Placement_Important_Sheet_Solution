import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/52tv4vw4bzfm/
public class TowerOfHonoi {
    static void printTOH(int n, char src, char helper, char dest) {
        if (n == 1) {
            System.out.println(n + ":" + src + "->" + dest);
        } else {
            printTOH(n - 1, src, dest, helper);
            System.out.println(n + ":" + src + "->" + dest);
            printTOH(n - 1, helper, src, dest);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTOH(n, 'A', 'B', 'C');
    }
    //if you like it plz give a star to the repository
    //it'll motivate us to do more question
    //http://github.com/bharatrav
}
/*
Problem Statement
From wiki-
The Tower of Hanoi is a mathematical puzzle where we have 3 rods and N disks. The puzzle starts with all the disks in ascending order of size on the first row. The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:

1. Only one disk can be moved at a time.
2. Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty rod.
3. No larger disk may be placed on top of a smaller disk.
-----x--x--x------

Let the rods have names A, B and C. Given N number of disks, numbered 1 to N from top to bottom, display all the moves required to move the disks from rod A to C in minimum number of steps.

Input
The only line of input contains an integer N denoting the number of disks

Constraints:
1 ≤ N ≤ 16
Output
Print sequence of moving disks, where each move is shown in the following format-
{DiskNumber}:{FromRod}->{ToRod}
Each move in the sequence is separated by a new line
Example
Input
2

Output
1:A->B
2:A->C
1:B->C

 */