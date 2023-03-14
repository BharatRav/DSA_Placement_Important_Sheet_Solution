import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/r68ygwgc2ou2/
public class StrongDivisibleNumbersContest {
    private static int StrongDivisible(int n ){
        int count=0;
        for (int i=1;i<=n;i++) {
            if(i%5==0 || i%7==0) {
                count++;
            }
        }
        return count;
    }
    public static void main (String[] args) {
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(StrongDivisible(n));
    }
}
/*
Problem Statement
There is an integer N given as input. Count all Strong numbers between 1 and n.
Note: Strong numbers are the number which are divisible by either 5 or 7.
Input
There is an integer n is given as input.

Constraints
1 ≤ N ≤ 105
Output
Return count of all string numbers in range of 1 to n.
Example
Sample Input:
10

Sample Output:
3

Explanation :
In Range of 1 to 10 only 5,7 and 10 are strong numbers.
 */