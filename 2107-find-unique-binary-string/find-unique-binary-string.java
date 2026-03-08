class Solution {
    public int stringToInt(String s){
        int n=s.length();
        int ans=0;
        int pow=1;
        for(int i=n-1;i>=0;i--){
            ans+=s.charAt(i)=='1'?pow:0;
            pow=pow*2;            
        }
        return ans;
    }
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(stringToInt(nums[i]));
        }     
        int i=0;           
        for(i=0;i<17;i++){
            if(!st.contains(i))
            break;
        }
        String ans="";
        while(i>0){
            if(i%2==1){
                ans='1'+ans;
            }
            else
            ans='0'+ans;
            i=i/2;
        }
        while(ans.length()<n){
            ans='0'+ans;
        }
        return ans;
    }
}