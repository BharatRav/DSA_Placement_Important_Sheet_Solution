import java.util.Scanner;

//LInk:-https://my.newtonschool.co/playground/code/b0sbkos8gi0c/
public class RemoveDuplicatesInPlace {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        int check=Integer.MAX_VALUE,count=0;
        for (int i=0;i<n-1;i++) {
            if (arr[i]==check) {
                continue;
            }
            if (arr[i]==arr[i+1]) {
                check=arr[i];
                i++;
                count++;
            }
            count++;
        }

        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav

        if (arr[n-1]!=arr[n-2]) {
            count++;
        }
        System.out.println(count);
    }
}
/*
Problem Statement
Given a sorted array, remove the duplicates in place such that each element appears at most twice and returns the new length.

Note that even though we want you to return the new length, make sure to change the original array as well in place

Do not allocate extra space for another array, you must do this in place with constant memory.
Input
First-line will contain a single integer N denoting array length
Second-line will contain the elements of the array

Constraints:
1 <= N <= 10^5
1 <= A[i] <= 10^5
Output
Print the length of the final array
Example
Sample Input:
4
1 1 1 2

Sample Output:
3

Explanation:-
A is now [1,1,2].

Sample Inpiut:
3
1 2 3

Sample Output:
3
 */