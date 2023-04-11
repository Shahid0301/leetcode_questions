class Solution {
    public String removeStars(String s) {
        StringBuffer stbr=new StringBuffer();
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length() ){
            if(s.charAt(i)!='*')
                st.push(s.charAt(i));
            else{
                if(st.isEmpty())
                    continue;
                st.pop();
                
                }
            i++;
            
        }
        for(char ch:st){
            stbr.append(Character.toString(ch));
        }
        return stbr.toString();
            
    }
}