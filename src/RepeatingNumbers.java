import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//Link:-https://my.newtonschool.co/playground/code/jrhws40n2yjp/

public class RepeatingNumbers {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();

        int[] nums1 = new int[n];
        int[] nums2 = new int[m];

        for (int i=0;i<n;i++) {
            nums1[i]= sc.nextInt();
        }
        for (int i=0;i<m;i++) {
            nums2[i]= sc.nextInt();
        }

        //if yu like it plz give a start to this repo
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        printResult(nums1,nums2,n,m);
    }

    private static void printResult(int[] nums1, int[] nums2, int n, int m) {
        int i=0,j=0;
        ArrayList<Integer> list =new ArrayList<>();
        while (i<n && j<m) {
            if(nums1[i]==nums2[j]) {
                if(!list.contains(nums1[i])){
                    list.add(nums1[i]);
                }
                i++;j++;
            } else if (nums1[i]<nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        for (int res:list) {
            System.out.print(res+" ");
        }
    }
}
/*
Problem Statement
    There are two arrays nums1 and nums2 are given as input having n and m elements respectively. print all distinct common elements in arrays in sorted order.
Input
    There are two integers n and m are given in first line as input.
    In Second line n space separated integers of array nums1 are given.
    In Third line m space separated integers of array nums2 are given.

Constraints
    1 <= n, m <= 103
    0 <= nums1[i], nums2[i] <= 109
Output
    Print all distinct common elements in arrays.
Example
    Sample Input:
    3 5
    1 2 4
    2 4 5 6 7

Sample Output:
    2 4
 */
