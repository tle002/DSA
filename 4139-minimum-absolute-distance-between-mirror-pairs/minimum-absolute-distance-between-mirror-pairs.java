class Solution {
    int reverse(int x){
        int rev=0;
        while(x>0){
            rev=rev*10+x%10;
            x/=10;
        }
        return rev;
    }
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int rev=reverse(nums[i]);
            //System.out.println(rev);
            if(map.containsKey(nums[i])){
                ans=Math.min(ans,Math.abs(i-map.get(nums[i])));
            }
            map.put(rev,i);
        }
        if(ans==Integer.MAX_VALUE)
        return -1;
        return ans;        
    }
}