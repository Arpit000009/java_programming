#include<iostream>
using namespace std;

int two(int n){
    if(n==1){
        return 2;
    }

    return two(n-1)+2;
}

int main(){
    int n= 10;
    cout<<two(10);
}