class Solution {
    public int maxDistance(int[] colors) {
        int madis=Integer.MIN_VALUE;
        for(int i=0;i<colors.length;i++){
            for(int j=colors.length-1;j>=0;j--){
                if(colors[i]!=colors[j]){
                    madis=Math.max(madis,Math.abs(j-i));
                    break;
                }
            }
        }   
        return madis;     
    }
}