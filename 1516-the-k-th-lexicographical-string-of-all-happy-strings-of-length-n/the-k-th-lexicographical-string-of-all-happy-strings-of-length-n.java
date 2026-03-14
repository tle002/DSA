class Solution {

    public String getHappyString(int n, int k) {

        StringBuilder s = new StringBuilder();
        s.append('a');
        for(int i = 1; i < n; i++){
            if(s.charAt(i-1) == 'a') s.append('b');
            else s.append('a');
        }
        for(int i = 1; i < k; i++){
            if(!add(s)) return "";
        }
        return s.toString();
    }

    private boolean add(StringBuilder s){

        int n = s.length();
        int i = n - 1;
        while(i >= 0){
            char next = (char)(s.charAt(i) + 1);
            while(next <= 'c'){
                if(i == 0 || s.charAt(i-1) != next){
                    s.setCharAt(i, next);
                    for(int j = i + 1; j < n; j++){
                        for(char c = 'a'; c <= 'c'; c++){
                            if(s.charAt(j-1) != c){
                                s.setCharAt(j, c);
                                break;
                            }
                        }
                    }
                    return true;
                }
                next++;
            }
            i--; 
        }
        return false;
    }
}