class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        int p=0;
        for(int i=columnTitle.length()-1;i>=0;i--){
            ans=ans+(int)(columnTitle.charAt(i)-'A'+1)*(int)Math.pow(26,p);        
            p++;
        }
        return ans;
    }
}