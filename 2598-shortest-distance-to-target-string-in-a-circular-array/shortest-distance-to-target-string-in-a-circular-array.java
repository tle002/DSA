class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int ans=Integer.MAX_VALUE;
                for(int i=0;i<words.length;i++){
                if(words[i].equals(target)){
                int currmin=Math.min(Math.abs(i-startIndex),Math.abs(words.length-Math.abs(i-startIndex)));
                ans=Math.min(ans,currmin);
            }
        }
        if(ans==Integer.MAX_VALUE) 
            return -1;
        return ans;
    }
}