class Solution {
public:
    int countPermutations(vector<int>& complexity) {
        int key=complexity[0];
        sort(complexity.begin(),complexity.end());
        if(complexity[0]!=key)
            return 0;
        if(complexity[0]==complexity[1])
            return 0;
        int n=complexity.size();
        long long ans=1;
        for(int i=n-1;i>=1;i--){
            ans=ans*i;
            ans=ans%1000000007;
        }
        return ans;      
    }
};