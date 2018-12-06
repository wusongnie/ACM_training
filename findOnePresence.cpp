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

vector<int> findOnePresence(vector<int>&);

int main(){
    vector<int> a = {1,3,3,5};//input vector a 
    vector<int> b = {1,2,4,4,5};//input vetor b
    
    a.insert(a.end(), b.begin(), b.end() );// add b to the back of a

    
    vector<int> result = findOnePresence(a);
    
    
    for(int i : result){
        cout << i << " ";// print out the elements in the result vector
    }
    
    return 0;
}

/*
This function finds out the elements which present only one time in both vector 
a and b. 
@complexity 
    Time complexity: O(log(M+N) + (M + N)) = O(M + N) while M is the size of the first array and N is 
    the size of the second array.
    
    Space complexity: O(M + N) since we are returning a vector of size M + N

@return 
    a vector containing only the elements present only one time

*/
vector<int> findOnePresence(vector<int>& vec){
    sort(vec.begin(), vec.end());// sort first to make sure erase unique works
    vec.erase(unique(vec.begin(), vec.end()), vec.end());// erase the repeated ones
    return vec;
}


