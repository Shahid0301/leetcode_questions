class Solution {
    public String removeStars(String s) {
        StringBuffer stbr=new StringBuffer();
        Stack<Character> st=new Stack<>();
        String ans="";
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                if(s.charAt(i)=='*')
                    continue;
                st.push(s.charAt(i));
            }
            else{
                if(s.charAt(i)=='*')
                    st.pop();
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        for(char ch:st){
            stbr.append(Character.toString(ch));
        }
        return stbr.toString();
            
    }
}