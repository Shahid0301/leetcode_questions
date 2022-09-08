class Solution {
    public String reverseWords(String s) {
     s.trim();
    String arr[]=s.split("\s+");
        String s1="";
        for(int i=arr.length-1;i>=0;i--){
            s1=s1+arr[i]+' ';
        }
        return s1.trim();
    }
}