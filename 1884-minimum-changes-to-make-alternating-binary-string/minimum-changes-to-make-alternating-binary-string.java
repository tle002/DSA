class Solution {
    public int minOperations(String s) {
        int one=1;
        int zero=0;
        int c1=0;
        int c2=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(s.charAt(i)=='0'){
                    c1++;
                }
                else{
                c2++;
                }
            }
            else{
                if(s.charAt(i)=='0'){
                    c2++;
                }else{
                    c1++;
                }
            
            }
            //System.out.println(c1+" "+c2);
        }    
        return Math.min(c1,c2);    
    }
}