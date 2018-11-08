// Complete the electionWinner function below.
string electionWinner(vector<string> votes) {
    map<string, int>elemap;
    for(string name : votes){
        if(elemap.find(name) == elemap.end()){
            elemap[name] = 1;
        }else{
            elemap[name] += 1;
        }
    }
    string winner = "";
    int winnerNum = 0;
    for(auto iter = elemap.begin(); iter != elemap.end(); iter++) {
        if(iter->second > winnerNum){
            winnerNum = iter->second;
            winner = iter->first;
        }else if (iter->second == winnerNum && iter->first > winner){
            winner = iter->first;
        }
    }
    return winner;
}

