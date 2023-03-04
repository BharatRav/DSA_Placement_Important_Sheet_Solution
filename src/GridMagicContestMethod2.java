import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/yazp7pgp2ef5/
public class GridMagicContestMethod2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];

        for (int i=0;i<n;i++) {

            arr[i] =sc.next();
        }
        char diag =arr[0].charAt(0);
        char rest ='\0';
        boolean isMagical= true;

        // if (diag==rest) {
        //     System.out.println("No");
        //     return ;
        // }

        // for (int i=0;i<n;i++) {
        //     for (int j=0;j<arr[i].length();j++) {
        //         System.out.print(arr[i].charAt(j)+" ");
        //     }
        //     System.out.println();
        // }

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if ((i==j || (i==n-j-1))) {
                    if (arr[i].charAt(j)!=diag) {
                        isMagical =false;
                        break;
                    }
                } else  {
                    if (rest =='\0') {
                        rest = arr[i].charAt(j);
                    } else if (arr[i].charAt(j) !=rest) {
                        isMagical =false;
                        break;
                    }
                }
            }
            if (!isMagical) {
                break;
            }
        }
        if (rest==diag) {
            isMagical =false;
        }
        if (isMagical) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
/*
Problem Statement
You are given a square character grid of side length N (where N is odd). You have to find whether the given grid is magical or not. A grid is said to be magical if it contains the same character on each element in its diagonal. Moreover, all the elements that are not present on the diagonal have to have the same character (which is different than the one on the diagonal).
Input
The first line contains integer N.
Each of the next N lines contain N lowercase English latin characters.

Constraints:
3 <= N <= 500
N is odd.
Output
Print "YES" if the given grid is magical, else print "NO", without the quotes.
Example
Sample Input:
3
aba
bab
aba

Sample Output:
YES

Explaination:
All characters on its diagonal are the same.
All the characters other than the diagonal are same.
The characters on the diagonal and the rest of the grid do not match.
Thus, it is a magical grid.
 */
