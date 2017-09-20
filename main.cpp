#include <iostream>
#include <sstream>
#include <cmath>
#include <vector>
#include <algorithm>
using namespace std;
int main(){
    string s;
    while(getline(cin, s)){
        if(s == "END") break;
        double d;
        istringstream sin(s);
        sin>>d;
        int intPart = floor(d);
        double doublePart = d - floor(d);
        int flag = 0;
        int t = 1;
        while(intPart > 3){
            int a = intPart % 3;
            if(a == 1) {
                flag = 1;
                break;
            }
            intPart /= 3;
        }
        vector<double>v;
        v.push_back(doublePart);
        int k = 0;
        while(flag == 0){
            doublePart *= 3;
            if(floor(doublePart) == 1) flag = 1;
            doublePart = doublePart - floor(doublePart);
            for(int i = 0; i < v.size(); i++){
                if(abs(doublePart - v[i]) < 1e-9) {k = 1; break;}
            }
            if (k == 1) break;
            else v.push_back(doublePart);
        }
        //for(int i = 0; i < v.size(); i++) cout<<v[i]<<endl;
        if(flag == 0) cout<<"MEMBER"<<endl;
        else cout<<"NON-MEMBER"<<endl;

    }
}