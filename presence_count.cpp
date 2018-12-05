/******************************************************************************
 
 Given two arrays of integers, please write a function that returns all elements
 present in one of the two arrays but not both.
 E.g. f([ 1, 3, 5 ], [ 1, 2, 4, 5 ]) -> [ 2, 3, 4 ]
 
 *******************************************************************************/
#include <iostream>
#include <unordered_map>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> findOnePresence(vector<int>&, vector<int>&);

int main(){
    vector<int> a = {1,3,5};//input vector a
    vector<int> b = {1,2,4,5};//input vetor b
    
    vector<int> result = findOnePresence(a,b);
    
    sort(result.begin(), result.end());
    for(int i : result){
        cout << i << " ";// print out the elements in the result vector
    }
    cout << endl; // flush output
    return 0;
}

/*
 This function finds out the elements which present only one time in both vector
 a and b.
 @complexity
 Time complexity: O(M + N) while M is the size of the first array and N is
 the size of the second array.
 
 Space complexity: O(M + N) while M is the size of the first array and N is
 the size of the second array.
 
 @return
 a vector containing only the elements present only one time
 
 */
vector<int> findOnePresence(vector<int>& a ,vector<int>& b){
    unordered_map<int,int> numberOfPresence;
    // this map keeps track of the number of presence of each element
    vector<int> result;// the return vector
    for(int i : a){
        numberOfPresence[i]++;
    }
    for(int i : b){
        numberOfPresence[i]++;
    }
    // after we record the number of occurence of each element,
    // we can simply get the result vector by recording the element with
    // a value of "1" in the map
    for(auto iter : numberOfPresence){
        if(iter.second == 1){
            result.push_back(iter.first);
        }
    }
    return result;
}

