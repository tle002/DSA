class Solution {
    public int minimumDistance(int[] nums) {
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        int minDistance = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }   
        for(int key: map.keySet()){
            ArrayList<Integer> list = map.get(key);
            if(list.size()<3)
                continue;
            for(int i=0;i<list.size()-2;i++){
                int distance = Math.abs(list.get(i+1) - list.get(i))+Math.abs(list.get(i+2) - list.get(i+1))+Math.abs(list.get(i+2) - list.get(i));
                minDistance = Math.min(minDistance, distance);
            }
        }
        if(minDistance == Integer.MAX_VALUE)
            return -1;
        return minDistance;   
    }
}