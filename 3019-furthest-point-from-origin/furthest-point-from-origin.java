class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0,r=0,d=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='L')
                l++;
            if(ch=='R')
                r++;
            if(ch=='_')
                d++;
        }
        return Math.max(Math.abs(l-r+d),Math.abs(l-r-d));
        
    }
}