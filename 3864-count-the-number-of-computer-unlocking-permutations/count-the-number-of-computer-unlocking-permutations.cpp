class Solution {
public:
    int countPermutations(vector<int>& complexity) {
        int key=complexity[0];
        int mi=key;
        int n=complexity.size();

        for(int i=1;i<n;i++){
            if(complexity[i]==key)
                return 0;
            mi=min(complexity[i],mi);
        }

        if(mi!=key)
        return 0;

        long long ans=1;
        for(int i=n-1;i>=1;i--){
            ans=ans*i;
            ans=ans%1000000007;
        }
        return ans;      
    }
};