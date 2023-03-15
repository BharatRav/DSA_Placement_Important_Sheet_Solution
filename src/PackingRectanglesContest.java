import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/kel8q9xrkfgv/
public class PackingRectanglesContest {
    static boolean bound(long w, long h, long N, long x) {
        // Find the number of rectangle
        // it can pack
        long val = (x / w) * (x / h);

        // If val is atleast N,
        // then return true
        if (val >= N)
            return true;

            // Otherwise, return false
        else
            return false;
    }

    // Function to find the size of the
    // smallest square that can contain
    // N rectangles of dimensions W * H

    static long FindSquare(long W, long H, long N) {

        // Stores the lower bound
        long i = 1;

        // Stores the upper bound
        long j = (long)Math.pow(10,18) ;

        // Iterate until i is less than j
        while (i < j) {

            // Calculate the mid value
            long mid = i + (j - i) / 2;

            // If the current size of square
            // cam contain N rectangles
            if (bound(W, H, N, mid))
                j = mid;

                // Otherwise, update i
            else
                i = mid + 1;
        }

        // Return the minimum size of the
        // square required
        return j;
    }

    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        long w= sc.nextLong();
        long h= sc.nextLong();
        long n= sc.nextLong();
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
        System.out.print(FindSquare(w, h, n));
    }
}
/*
Problem Statement
There are n rectangles of the same size: w in width and h in length. It is required to find a square of the smallest size into which these rectangles can be packed. Rectangles cannot be rotated.
Input
The first line of the input contains three space-separated integers w, h and n.

Constraints
1 ≤ w, h, n ≤ 109
Output
Output the minimum length of a side of a square, into which the given rectangles can be packed.
Example
Sample Input :
2 3 10
Sample Output:
9

Explanation:
9 is the minimum size of the square in which all these rectangles can fit.

 */