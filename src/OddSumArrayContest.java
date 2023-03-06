import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/2firh482rr4n/
public class OddSumArrayContest {
    private static boolean isSorted(List<Integer> list) {
        boolean flag =true;
        for (int i=0;i<list.size()-1;i++) {
            if(list.get(i)>list.get(i+1)) {
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i=0;i<n;i++) {
            int data= sc.nextInt();
            if (data%2==0) {
                even.add(data);
            }
            else {
                odd.add(data);
            }
        }
        if (isSorted(even) && isSorted(odd)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
    }
}
/*
Problem Statement
You are given an array A of size N. In one move, you can swap Ai and Ai+1 if Ai + Ai+1 is odd. Find out if you can sort this array non- decreasingly after performing any (possibly 0) number of moves.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space separated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 109
Output
Print "YES" if you can sort the array non- decreasingly, else print "NO", without the quotes.
Example
Sample Input:
4
1 6 31 14

Sample Output:
YES
 */