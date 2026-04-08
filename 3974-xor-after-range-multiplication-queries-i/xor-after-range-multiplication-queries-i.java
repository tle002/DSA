class Solution {
    public int xorAfterQueries(int[] num, int[][] queries) {
        int n=queries.length;
        int mod=1000000007;
        int m=num.length;
        long[] nums=new long[m];
        for(int i=0;i<m;i++){
            nums[i]=(long)(num[i]);
        }
        for(int i=0;i<n;i++){
            for(int j=queries[i][0];j<=queries[i][1];j+=queries[i][2]){
                nums[j] = ((nums[j]*queries[i][3])%mod);
            }
        }
        long ans=0;
        for(long i:nums){
            ans=ans^i;
        }
        return (int)ans;
    }
}