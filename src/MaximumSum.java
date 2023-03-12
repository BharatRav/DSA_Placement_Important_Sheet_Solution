import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/0sl2m6wnilbw/
public class MaximumSum {
    public static void main (String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }

        long result=0,leftResult=0,rightRisult=0;
        int i=0,j=n-1;

        while (i<j) {
            if (leftResult==rightRisult) {
                result =Math.max(result,leftResult);
                leftResult+=arr[i];
                i++;
                // j--;
            }else if (leftResult<rightRisult) {
                leftResult+=arr[i++];
            }else {
                rightRisult+=arr[j--];
            }

        }
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav
        System.out.println(result);
    }
}
/*
Problem Statement
Given an array Arr of N integers, You have to split the array into three parts such that

the sum of the elements of the first part is equal to the sum of the elements of the third part

the sum of elements of the second part is minimum possible.


Note:- The arrays after splitting can contain 0 elements.
Input
The first line of input contains a single integer N. The next line of input contains N space separated elements.

Constraints:-
1 <= N <= 100000
1 <= Arr[i] <= 100000
Output
Print the sum of elements of part 1 after splitting the array.
Example
Sample Input:-
5
1 3 2 1 4

Sample Output:-
4

Explanation:-
part 1 :- 1 3
part 2 :- 2 1
part 3 :- 4

Sample Input:-
3
4 1 2

Sample Output:-
0
 */