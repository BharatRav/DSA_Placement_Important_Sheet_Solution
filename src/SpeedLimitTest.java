import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/7qbjnggc6sz6/
public class SpeedLimitTest {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int tc  = sc.nextInt();

        while(tc-->0) {
            int A =sc.nextInt(); //distance alice
            int X =sc.nextInt(); //time alice
            int B =sc.nextInt(); //distance bob
            int Y =sc.nextInt(); //time bob
            printResult(A,X,B,Y);
        }
        //speed =D/T;

    }
    private static void printResult(int A, int X, int B, int Y) {
        double alice =(double)A/X;
        double bob =(double)B/Y;
        // System.out.println("data  A:"+A+" X:" + X+" alice:" + alice+" bob:" + bob+" B:" +B+" Y:" +Y);
        if(alice>bob) {
            System.out.println("ALICE");
        } else if (alice==bob) {
            System.out.println("EQUAL");
        } else {
            System.out.println("BOB");
        }
    }

    //if you like it plz give a star to the repository
    //it'll motivate us to do more question
    //http://github.com/bharatrav
}
/*
Problem Statement
Alice is driving from her home to her office which is A kilometers away and will take her X hours to reach. Bob is driving from his home to his office which is B kilometers away and will take him Y hours to reach. Determine who is driving faster, else, if they are both driving at the same speed print EQUAL.
Input
The first line will contain T, the number of test cases. Then the test cases follow. Each test case consists of a single line of input, containing four integers A, X, B, and Y, the distances and and the times taken by Alice and Bob respectively.

Constraints
1 ≤ T ≤ 1000
1 ≤ A, X, B, Y ≤ 1000
Output
For each test case, if Alice is faster, print ALICE. Else if Bob is faster, print BOB. If both are equal, print EQUAL.
Example
Sample Input :
3
20 6 20 5
10 3 20 6
9 1 1 1
Sample Output :
Bob
Equal
Alice
Explanation :
Since Bob travels the distance between his office and house in 5 hours, whereas Alice travels the same distance of 20 kms in 6 hours, BOB is faster.
Since Alice travels the distance of 10 km between her office and house in 3 hours and Bob travels a distance of 20 km in 6 hours, they have equal speeds.
Since Alice travels the distance of 9 km between her office and house in 1 hour and Bob travels only a distance of 1 km in the same time, ALICE is faster.
 */