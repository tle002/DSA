class Solution {
    public int maxDistance(int[] colors) {
        int madis=Integer.MIN_VALUE;
        for(int i=0;i<colors.length;i++){
            for(int j=i+1;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                    madis=Math.max(madis,Math.abs(j-i));
                }
            }
        }   
        return madis;     
    }
}