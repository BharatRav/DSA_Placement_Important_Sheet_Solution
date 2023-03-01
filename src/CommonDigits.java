import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Link:-https://my.newtonschool.co/playground/code/t7b8bfuy1pb5/
public class CommonDigits {
    public static void main (String[] args) throws IOException {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str =br.readLine().split(" ");
        br.close();

        int i=0,j=0;
        while(i<str[0].length() && j <str[1].length()) {
            if (str[0].charAt(i) == str[1].charAt(j)) {
                System.out.print(str[0].charAt(i) + " ");
            }
            i++;
            j++;
        }
    }
}
/*
Problem Statement
There are two number a and b are given as input. Print common digits with common index in these numbers seperated by space.
Input
There are two number a and b are given as input.

Constraints
1 <= a, b <= 106
Output
Print common digits with common index in these numbers seperated by space.
Example
Sample Input:
24324345 3546434
Sample Output:
4 3 4
 */
