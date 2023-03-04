import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/yazp7pgp2ef5/
public class GridMagicContest {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String[] strs = new String[n];

        for (int i=0;i<n;i++) {
            strs[i]= sc.next();
        }
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav

        boolean flag=true;  //initially assuming its magical grid
        char diag =strs[0].charAt(0);
        char elem =strs[0].charAt(1);

        for (int i=0;i<n;i++) {
            int size =strs[i].length();
            int j =0;

            while(j<size) {
                if ((i==j || j==size-i-1) && diag != strs[i].charAt(j)) {
                    flag=false;
                    break;
                } else {
                    if((i!=j && j!=size-i-1) && elem!=strs[i].charAt(j)) {
                        flag=false;
                        // System.out.println(i+" "+j);
                        break;
                    }
                }
                j++;
            }
            if (!flag) {
                break;
            }
        }
        if (elem==diag) {
            flag =false;
        }
        if(flag) {
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
