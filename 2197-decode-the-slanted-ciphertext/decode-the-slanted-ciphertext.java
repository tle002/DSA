class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n=rows;
        int m=encodedText.length()/n;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j*(m)+i+j<encodedText.length())
                sb.append(encodedText.charAt(j*(m)+i+j));
            }
        }
        int idx=sb.length()-1;
        while(idx>=0 && sb.charAt(idx)==' '){
            idx--;
        }
        return sb.substring(0,idx+1);        
    }
}