#include<bits/stdc++.h>
using namespace std;

unordered_map<long long,long long> dp;

long long fib(long long n) {
        if(n==0 || n==1){
            return n;
        }

        if(dp.find(n)!=dp.end()){
            return dp[n];
        }

        long long a1 = fib(n-1);
        long long a2 = fib(n-2);

        dp[n] = a1 + a2;
        return a1 + a2;
        
    }

int main(){
    long long n;
    cin>>n;

    cout<<fib(n);
}