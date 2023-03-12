import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/xmn2o6nzmkqi/
public class MaximumLength {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }


        int start =0,uniqueCount=0,answer=0;
        int[] freq = new int[100001];

        for (int end=0;end<n;end++) {
            freq[arr[end]]++;
            if (freq[arr[end]]==1) {
                uniqueCount++;
            }

            while (uniqueCount>k-1) {
                freq[arr[start]]--;
                if (freq[arr[start]]==0) {
                    uniqueCount--;
                }
                start++;
            }
            answer =Math.max(answer,end-start+1);
        }
        System.out.println(answer);
        //if you like it plz give a star to the repository
        //it'll motivate us to do more question
        //http://github.com/bharatrav

    }
}
/*
Problem Statement
You are given an array of length N and an integer K. The array will contain integers numbered through 1 to K. Your task is to calculate the maximum length of the subarray containing not more than K-1 distinct numbers(atleast one number which does not occur in the subarray)
Input
The first line contains two integers N and K
The second line contains N space-separated integers

Constraints

1<=K , N<=100000
1<=A[I]<=100000
Output
Print a single line containing one integer ― the maximum length of a valid subsegment.
Example
Sample Input
6 2
1 1 1 2 2 1


Sample output:-
3


Sample Input:-
5 3
1 1 2 2 1


Sample Output:-
5
 */