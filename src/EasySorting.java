import java.util.Arrays;
import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/hpx8os46uzdr/
public class EasySorting {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        String[] str = new String[5];

        for (int i=0;i<5;i++) {
            str[i] = sc.next();
        }
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav

        Arrays.sort(str);

        for (String val: str) {
            System.out.print(val+" ");
        }
    }
}
/*
Problem Statement
An array of 5 string is given where each string contains 2 characters, Now you have to sort these strings, like in a dictionary.
Input
Input contains 5 strings of length 2 separated by spaces.
String contains only uppercase English letters.
Output
Print the sorted array.
Example
INPUT :
AS KF ER DD JK

OUTPUT :
AS DD ER JK KF
 */
