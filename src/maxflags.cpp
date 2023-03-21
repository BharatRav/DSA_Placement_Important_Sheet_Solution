#include "bits/stdc++.h"

//Link:-https://my.newtonschool.co/playground/code/cmevjpchuige/
#pragma GCC optimize "03"

using namespace std;



#define int long long int

#define ld long double

#define pi pair<int, int>

#define pb push_back

#define fi first

#define se second

#define IOS ios::sync_with_stdio(false); cin.tie(0); cout.tie(0)

#ifndef LOCAL

#define endl '\n'

#endif



const int N = 1e5 + 5;

const int mod = 1e9 + 7;

const int inf = 1e9 + 9;



int a[N];



signed main() {

	IOS;

	int t;	cin >> t;

	while(t--){

		memset(a, 0, sizeof a);

		int n, m;

		cin >> n >> m;

		int mx = 0, flag = 0;

		for(int i = 1; i <= m; i++){

			int p;	cin >> p;

			if(p == n+1){

				flag = mx;

			}

			else{

				a[p] = max(a[p], flag) + 1;

				mx = max(mx, a[p]);

			}

		}
		//if you like it plz give a star to the repository
                //it'll motivate us to do more question
                //http://github.com/bharatrav

		for(int i = 1; i <= n; i++){

			a[i] = max(a[i], flag);

			cout << a[i] << " ";

		}

		cout << endl;

	}

	return 0;

}

/*
Problem Statement
You are given N flags, initially set to 0. Now you have to perform two operations on them:
1. Increase(F) by 1: flag F is increased by 1.
2. max_flag: all flags are set to a maximum value of any flag.
A non-empty array arr[] will be given of size M. This array represents consecutive operations:
a) If arr[K] = F, such that 1 <= F <= N then operation K is Increase(F).
b) If arr[K] = N+1 then operation K is max_flag.

The goal is to calculate the value of every flag after all operations.
Input
The input line contains T, denoting the number of test cases.
Each test case contains two lines.
The first line contains an integer N, the number of flags, and an integer M, the size of the array 'arr'.The second line contains elements of the array 'arr' separated by space.

Constraints:
1 <= T <= 100
1 <= N, M <= 10^5
1 <= arr[i] <= N+1
Sum of N and M for each test case is less than or equal to 10^5
Output
For each testcase you need to print the updated array after all operations in new line.
Example
Sample Input:
1
5 7
3 4 4 6 1 4 4

Sample Output:
3 2 2 4 2

Explanation:
Testcase 1:
the values of the flags after each consecutive operation will be:
(0, 0, 1, 0, 0)
(0, 0, 1, 1, 0)
(0, 0, 1, 2, 0)
(2, 2, 2, 2, 2)
(3, 2, 2, 2, 2)
(3, 2, 2, 3, 2)
(3, 2, 2, 4, 2)
*/