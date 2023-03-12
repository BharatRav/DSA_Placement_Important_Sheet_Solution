import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/koy6f8qgno3s/
class HipHipArray {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }

        long product=1,sum=0;
        boolean flag =true;     //is Sum posible

        for (int i=n-1;i>=0;i--) {
            if (flag) {
                product*=arr[i];
            } else {
                sum+=arr[i];
            }
            flag= !flag;
        }
        System.out.println(sum+" "+product);
    }
    //if you like it plz give a star to the repository
    //it'll motivate us to do more question
    //http://github.com/bharatrav
}
// 1 2 3 4 5 6
// 6 5 4 3 2 1

// 1 2 3 4 5
// 5 4 3 2 1

// 1 2 3
// 3 2 1



/*
Problem Statement
You will be given an array of N numbers. Your task is to first reverse the array (the first number becomes last, 2nd number becomes 2nd from the last, and so on) and then print the sum of the numbers at even indices and print the product of the numbers at odd indices.

Note : 1 based indexing is followed .
Input
The first line contains a single integer N: the number of elements
The second line contains N different integers separated by spaces

constraints:-
1 <= N <= 35
1 <= a[i] <= 10
Output
Two space separated integers representing sum of the numbers at even places and the product of the numbers at odd places.

Example
Sample Input 1:
6
1 2 3 4 5 6

Sample Output 1:
9 48

Sample Input 2:
3
1 2 3

Sample Output 2:
2 3

Explanation 1:-
After reversing 1 2 3 4 5 6 becomes 6 5 4 3 2 1
Hence the sum of the numbers at even indices: 5+3+1=9
product of the numbers at odd indices: 6*4*2=48
 */