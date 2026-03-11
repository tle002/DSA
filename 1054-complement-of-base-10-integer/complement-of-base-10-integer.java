class Solution {
    public int bitwiseComplement(int n) {
        int ans=0;
        int pow=1;
        if(n==0)
        return 1;
        while (n>0){
            ans+=pow*((n%2)==0?1:0);
            pow=pow*2;
            n=n/2;
        }
        return ans;
    }
}