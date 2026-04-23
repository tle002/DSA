class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] ans = new long[n];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        Map<Integer, List<Long>> prefixSum = new HashMap<>();
        for (int key : map.keySet()) {
            List<Integer> list = map.get(key);
            List<Long> prefix = new ArrayList<>();
            long sum = 0;
            for (int i : list) {
                sum += i;
                prefix.add(sum);
            }
            prefixSum.put(key, prefix);
        }
        for (int k : map.keySet()) {
            List<Integer> list = map.get(k);
            List<Long> pSum = prefixSum.get(k);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                long indx = list.get(i);
                long leftsum = (indx * (i + 1)) - pSum.get(i);
                long rightsum = (pSum.get(size - 1) - pSum.get(i)) - (indx * (size - i - 1));
                ans[(int)indx] = leftsum + rightsum;
            }
        }
        return ans;
    }
}