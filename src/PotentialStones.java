import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class PotentialStones {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int x=sc.nextInt();
        int start =-1000000;

        //if you like it plz give a star to this repository
        if ((x-k+1) >=start && x+k-1<=1000000) {
            int i=x-k+1;
            while (i<=(x+k-1)) {
                System.out.print(i+" ");
                i++;
            }
        }
    }
}
//githubId:-https://github.com/BharatRav
/*

Problem Statement
    There are 2000001 stones placed on a number line. The coordinates of these stones are −1000000, −999999, −999998, …, 999999, 1000000. Among them, some K consecutive stones are painted black, and others are painted white. Additionally, we know that the stone at coordinate X is painted black.
    Print all coordinates that potentially contain a stone painted black, in ascending order.

Input
    The input consists of two space-separated integers.
    K X

Constraints
    1≤K≤100
    0≤X≤100
    All values in the input are integers.
Output
    Print all coordinates that potentially contain a stone painted black, in ascending order, with spaces in between.
Example
    Sample Input 1
        3 7
    Sample Output 1
        5 6 7 8 9

    Sample Input 2
        4 0
    Sample Output 2
        -3 -2 -1 0 1 2 3

    Sample Input 3
        1 100
    Sample Output 3
        100
 */