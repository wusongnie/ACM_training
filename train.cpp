#include <iostream>
#include <stdio.h>
#include <vector>
#include <limits.h>
#include <algorithm>

using namespace std;

int solve(int i, int j, vector<int>&v){
    int mubiao = v[j];
    int res = 0;
    for(int k = i; k <= j; ++k){
        res += mubiao - v[k];
    }
    return res;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int testCaseNum = 0;
    cin >> testCaseNum;
    int counter = 1;
    while(testCaseNum--){
        int total = 0;
        int teamNum = 0;
        cin >> total >> teamNum;
        vector<int> v;
        for(int i = 0; i < total; ++i){
            int temp = 0;
            cin >> temp;
            v.push_back(temp);
        }
        sort(v.begin(),v.end());
        int result = INT_MAX;
        for(int i = 0; i <= total - teamNum; ++i){
            int temp = solve(i, i + teamNum - 1,v);
            if(result > temp){
                result = temp;
            }
        }
        cout << "Case #"<<counter++<<": " << result << "\n";
    }
    return 0;
}


