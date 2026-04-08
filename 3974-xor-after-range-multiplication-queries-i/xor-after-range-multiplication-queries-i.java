class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n=queries.length;
        int mod=1000000007;
        for(int i=0;i<n;i++){
            for(int j=queries[i][0];j<=queries[i][1];j+=queries[i][2]){
                nums[j] = (int)((1L*nums[j]*queries[i][3])%mod);
            }
        }
        int ans=0;
        for(int i:nums){
            ans=ans^i;
        }
        return ans;
    }
}