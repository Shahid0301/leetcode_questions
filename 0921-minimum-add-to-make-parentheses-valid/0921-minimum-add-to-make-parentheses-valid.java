class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int p=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else if(!st.isEmpty() && s.charAt(i)==')'){
                st.pop();
            }
            else{
                p++;
            }
        }
        return st.size()+p;
    }
}