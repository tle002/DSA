class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
            Set<Map.Entry<Integer, Integer>> set = new HashSet<>();
            for (int[] obstacle : obstacles) {
                set.add(Map.entry(obstacle[0], obstacle[1]));
            }
            int x=0,y=0;
            int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
            int d=0;
            int ans=0;
            for(int cmd: commands){
                if(cmd==-2){
                    d=(d+3)%4;
                }else if(cmd==-1){
                    d=(d+1)%4;
                }else{
                    for(int i=0;i<cmd;i++){
                        int nx = x + dirs[d][0];
                        int ny = y + dirs[d][1];
                        
                        if(set.contains(Map.entry(nx, ny))){
                            break;
                        }
                        x=nx;
                        y=ny;
                        ans=Math.max(ans,nx*nx+ny*ny);
                    }
                }
            }
        return ans;
    }
}