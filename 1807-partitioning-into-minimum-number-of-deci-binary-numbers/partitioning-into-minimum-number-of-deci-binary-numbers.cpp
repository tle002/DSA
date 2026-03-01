class Solution {
public:
    int minPartitions(string n) {
        int ans=-1;
        for(auto x:n){
            ans=max(x-'0',ans);
        }
        return ans;
        
    }
};