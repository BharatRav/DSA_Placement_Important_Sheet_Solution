import java.util.Arrays;
import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/2l721kp2a5qe/
public class KPairs {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextLong();
        long count=0;
        long arr[]=new long[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }

        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            long y=k/arr[i];
            if(y*arr[i]<k)y++;
            long t=greaterElement(arr,n-1,y,i+1);
            count=count+t;
        }
        System.out.print(count);
    }
    //if you like it plz give a star to the repository
    //it'll motivate us to do more question
    //http://github.com/bharatrav

    static int greaterElement(long arr[],int right,long k,int left){
        int n=arr.length;
        int count=n;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>=k){
                count=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return n-count;
    }
}
/*
Problem Statement
Given an array A of size N and an integer K, find and print the number of pairs of indices i, j (1 <= i < j <= N) such that Ai * Aj > K.
Input
First line of the input contains two integers N and K.
The second line of the input contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= K <= 1012
1 <= Ai <= 106
Output
Print the number of pairs of indices i, j (1 <= i < j <= N) such that Ai * Aj > K.
Example
Sample Input:
7 20
5 7 2 3 2 9 1

Sample Output:
5

Explanation:
The following pairs of indices satisfy the condition (1-based indexing)
(1, 2) -> 5 * 7 = 35
(1, 6) -> 5 * 9 = 45
(2, 4) -> 7 * 3 = 21
(2, 6) -> 7 * 9 = 63
(4, 6) -> 3 * 9 = 27
All these products are greater than K (= 20).
 */