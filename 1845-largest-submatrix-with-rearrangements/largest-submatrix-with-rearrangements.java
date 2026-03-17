class Solution {
    public int largestSubmatrix(int[][] matrix) {
        ArrayList<ArrayList<Integer>>  list = new ArrayList<>();
        int ans=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i!=0&&matrix[i][j] == 1){
                    matrix[i][j] = matrix[i-1][j]+1;
                }
            }
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<matrix[0].length;j++){
                temp.add(matrix[i][j]);
            }
            
            Collections.sort(temp);
            Collections.reverse(temp);
            for(int j=0;j<temp.size();j++){
                ans=Math.max(ans,temp.get(j)*(j+1));
            }
        }
        return ans;       
    }
}