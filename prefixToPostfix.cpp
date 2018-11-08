/*
 * Complete the 'prefixToPostfix' function below.
 *
 * The function is expected to return a STRING_ARRAY.
 * The function accepts STRING_ARRAY prefixes as parameter.
 */
bool isOperator(char x) { 
    switch (x) { 
        case '+': 
            return true; 
        case '-': 
            return true; 
        case '/': 
            return true; 
        case '*': 
            return true; 
    } 
  return false; 
} 
string helper (string& str){
    stack<string> s; 
    
    for (int i = str.size() - 1; i >= 0; i--) { 
        if (isOperator(str[i])) { 
            string op1 = s.top(); 
            s.pop(); 
            string op2 = s.top(); 
            s.pop(); 
            string temp = op1 + op2 + str[i]; 
            s.push(temp); 
        }else { 
            s.push(string(1, str[i])); 
        } 
    }
    return s.top(); 
}
vector<string> prefixToPostfix(vector<string> prefixes) {
    vector<string> res;
    for(string s : prefixes){
        res.push_back(helper(s));
    }
    return res;
}
