#include<iostream>
#include<vector>
#include<list>
using namespace std;

void adjlist(vector<vector<int>> &vec,vector<list<int>> &adjlist){
    for(int i=0;i<vec.size();i++){
        int u = vec[i][0];
        int v = vec[i][1];
        adjlist[u].push_back(v);
        adjlist[v].push_back(u);
    }
}

void dfs(int u,vector<list<int>>&adlist,vector<bool>&vis){
    cout<<u<<" ";
    vis[u] = true;

    for(int v:adlist[u]){
        if(vis[v]!=true){
            dfs(v,adlist,vis);
        }
    }
}

int main(){
    vector<vector<int>>vec = {
        {0,1},
        {1,2},
        {1,3},
        {2,4}
    };
    int V = 5;
    vector<list<int>> adlist(V);
    adjlist(vec,adlist);

    for(int i=0;i<adlist.size();i++){
        cout<<i<<" : ";
        for(int num : adlist[i]){
            cout<< num<<" ";
        }
        cout<<endl;
    }
    cout<<endl;
    vector<bool>vis(V,false);
    dfs(0,adlist,vis);
}