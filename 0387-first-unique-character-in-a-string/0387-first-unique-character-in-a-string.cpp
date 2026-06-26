class Solution {
public:
    int firstUniqChar(string s) {
        int sd=0;
        for(int i=0; i<s.size(); i++){
            sd=0;
            for(int j=0; j<s.size(); j++){
                if(s[i]==s[j] && i!=j){
                    sd=1;
                    break;
                }
            }
            if(sd==0){
                return i;
            }
        }
        return -1;
    }
};