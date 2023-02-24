#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;
#define int long long
signed main() {
	// Your code here
    int n,r=0,c=0;
    cin>>n;
    int k;
    cin>>k;
    int ans= n*n;
    vector<int> row(n+1),col(n+1);
    while(k--) {
        int i,j;
        cin>>i>>j;
        if(row[i]==0) ans-=n-c,row[i]=1,r++;
        if(col[j]==0) ans-=n-r,col[j]=1,c++;
        cout<<ans<<' ';
    }
}