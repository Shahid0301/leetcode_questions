class Solution {
    public String truncateSentence(String s, int k) {
        String s1[]=s.split(" ");
        String ans="";
        for(int i=0;i<k;i++){
            ans+=s1[i]+" ";
        }
        return ans.trim();
    }
}