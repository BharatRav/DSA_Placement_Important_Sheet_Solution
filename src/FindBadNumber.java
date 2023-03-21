import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/nll3xg4omg9w/
public class FindBadNumber {
    private static boolean GCDHelper(int a, int b) {
        while (a%b==0) {
            a = a/b;
        }
        return a==1;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }

        for (int i=0;i<n;i++) {
            if(!GCDHelper(arr[i],x)) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
/*
Problem Statement
Alex always skips math class. As a punishment, his teacher has given him an array of size n where every number except one is the power of x.
Being poor in mathematics, Alex has asked for your help to solve the problem. Can you help him to find the bad number which is not a power of x?

NOTE:
It is guaranteed that there always exists an answer.
Input
The first line of the input contains the integers n and x
The following line contains n integers describing the array a

Constraints
2 ≤ n ≤ 1000
1 ≤ x ≤ 20
1 &le ai ≤ 108
Output
For each test case, output a single line containing the bad number.
Example
input
6 7
16807 343 50 823543 2401 5764801

output
50
 */