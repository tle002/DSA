class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] even=new int[26];
        int[] odd=new int[26];
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                even[s1.charAt(i)-'a']++;
            }
            else{
                odd[s1.charAt(i)-'a']++;
            }
        }
        int even2[]=new int[26];
        int odd2[]=new int[26];
        for(int i=0;i<s2.length();i++){
            if(i%2==0){
                even2[s2.charAt(i)-'a']++;
            }
            else{
                odd2[s2.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(even[i]!=even2[i] || odd[i]!=odd2[i]){
                return false;
            }
        }
        return true;
    }
}