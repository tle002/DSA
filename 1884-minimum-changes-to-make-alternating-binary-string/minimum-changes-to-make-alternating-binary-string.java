class Solution {
    public int minOperations(String s) {
        int c1=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            c1+=(s.charAt(i)^i)&1;
        }    
        return Math.min(c1,n-c1);    
    }
}