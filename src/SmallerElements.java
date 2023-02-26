public class SmallerElements {
    static int smallerElements(int a[], int n, int k){
        int low=0;
        int high=n-1;
        int idx=-1;

        while (low<=high) {
            int mid =low+(high-low)/2;

            if (a[mid]<=k) {
                low =mid+1;
                idx =mid;
            } else {
                high =mid-1;
            }
        }
        return  idx+1;
    }
}
/*
Problem Statement
    Given a sorted array of N integers a[], and Q queries. For each query, you will be given a positive integer K and your task is to print the number of elements in array a[] that are smaller than or equal to K.
    Input
    In case of Java only
    User Task:
    Since this will be a functional problem, you don't have to take input. You just have to complete the function smallerElements() that takes the array a[], integer N and integer k as arguments.

Custom Input
    The first line of input contains a single integer N.
    The second line of input contains N space- separated integers depicting the values of the array.
    The third line of input contains a single integer Q, the number of queries.
    Each of the next Q lines of input contain a single integer, the value of K.

Constraints:-
    1 <= N <= 105
    1 <= K, Arr[i] <= 1012
    1 <= Q <= 104

Output
    Return the count of elements smaller than or equal to K.

Example
    Sample Input:-
        5
        2 5 6 11 15
        5
        2
        4
        8
        1
        16

    Sample Output:-
        1
        1
        3
        0
        5
 */
