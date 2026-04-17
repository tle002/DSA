class Solution {
    int reverse(int x){
        String str=Integer.toString(x);
        str=new StringBuilder(str).reverse().toString();
        return Integer.parseInt(str);
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