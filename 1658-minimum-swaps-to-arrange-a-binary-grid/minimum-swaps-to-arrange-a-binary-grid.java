import java.util.*;

class Solution {
    public int minSwaps(int[][] grid) {
        List<Integer> zerocounts = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            int count=0;
            for(int j=grid[i].length-1;j>=0;j--){
                if(grid[i][j]==0){
                    count++;
                }
                else{
                    break;
                }
            }
            zerocounts.add(count);
        }
        int ans=0;
        for(int i=0;i<zerocounts.size();i++){
            int j=i;
            while(j<zerocounts.size() && zerocounts.get(j)<(grid.length-1-i)){
                j++;
            }
            if(j==zerocounts.size()){
                return -1;
            }
            ans+=j-i;
            while(j>i){
                int temp=zerocounts.get(j);
                zerocounts.set(j,zerocounts.get(j-1));
                zerocounts.set(j-1,temp);
                j--;
            }
        }
        return ans;
    }
}