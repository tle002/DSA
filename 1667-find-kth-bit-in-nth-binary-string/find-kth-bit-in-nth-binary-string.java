class Solution {
    StringBuilder invert(StringBuilder s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        return sb;
    }
    public char findKthBit(int n, int k) {
        String s="0";        
        StringBuilder st=new StringBuilder(s);
        int i=2;
        while(i<=n){ 
            StringBuilder sb=new StringBuilder();
            sb.append(st).append("1").append(invert(st).reverse());
            st = sb;
            i++;
        }
        return st.charAt(k-1);
    }
}