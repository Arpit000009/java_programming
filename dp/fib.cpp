#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;
    int prev_prev = 0;
    int prev = 1;
    int ans;
    for(int i=2;i<n;i++){
        ans = prev + prev_prev;
        prev_prev = prev;
        prev = ans;
    }

    cout<<ans;
}