//Link:- https://my.newtonschool.co/playground/code/gz1eq60zygw4/

#include <bits/stdc++.h> // header file includes every Standard library
#include<iostream>
#include<algorithm>
using namespace std;

long long needCounts(int mid, int arr[], int n) {
    long long sum=0;
    for (int i=n/2;i<n;i++) {
        if(arr[i]<mid) sum+=mid-arr[i];
    }
    return sum;
}

int main() {
	// Your code here
    int n,k;
    cin>>n>>k;
    int arr[n];

    for (int i=0;i<n;i++) cin>>arr[i];\

    sort(arr,arr+n);

    long long start =0,end =2e9;
    long long res=0;
    while(start<=end) {
        long long mid =start +(end-start)/2;

        if(needCounts(mid,arr,n)>k) {
            end =mid-1;
        }
        else {
            start =mid+1;
            res =mid;
        }
    }
    cout<<res;
    return 0;
}
/*
Problem Statement
You are given an array a of n integers, where n is odd. You can make the following operation with it:

Choose one of the elements of the array (for example a[i]) and increase it by 1 (that is, replace it with a[i]+1).
You want to make the median of the array the largest possible using at most k operations.

The median of the odd-sized array is the middle element after the array is sorted in non-decreasing order. For example, the median of the array [1,5,2,3,5] is 3.
Input
The first line contains two integers n and k— the number of elements in the array and the largest number of operations you can make.

The second line contains n integers, the elements of the array.

Constraints
1 <= n <= 100000 (n is odd)
1 <= k <= 1000000000
Output
Print a single integer — the maximum possible median after the operations.
Example
Sample Input
3 2
1 3 5

Sample Output
5

Explanation:-
You can increase the second element twice. Then array will be [1,5,5] and it's median is 5.

Sample Input
5 5
1 2 1 1 1

Sample Output
3
*/