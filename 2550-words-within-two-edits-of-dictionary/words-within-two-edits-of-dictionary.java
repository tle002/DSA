class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        
        for (String q : queries) {
            for (String d : dictionary) {
                if (canMatch(q, d)) {
                    ans.add(q);
                    break; 
                }
            }
        }
        return ans;
    }

    private boolean canMatch(String q, String d) {
        int edits = 0;
        for (int i = 0; i < q.length(); i++) {
            if (q.charAt(i) != d.charAt(i)) {
                edits++;
            }
            if (edits > 2) return false;
        }
        return true;
    }
}