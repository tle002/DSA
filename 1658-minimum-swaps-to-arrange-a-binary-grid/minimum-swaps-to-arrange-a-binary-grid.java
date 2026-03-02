import java.util.*;

class Solution {
    public int minSwaps(int[][] grid) {
        int[] zerocounts = new int[grid.length];
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
            zerocounts[i]=count;
        }
        int ans=0;
        for(int i=0;i<zerocounts.length;i++){
            int j=i;
            while(j<zerocounts.length && zerocounts[j]<(grid.length-1-i)){
                j++;
            }
            if(j==zerocounts.length){
                return -1;
            }
            ans+=j-i;
            for(int k=j;k>i;k--){
                int temp=zerocounts[k];
                zerocounts[k]=zerocounts[k-1];
                zerocounts[k-1]=temp;
            }
        }
        return ans;
    }
}