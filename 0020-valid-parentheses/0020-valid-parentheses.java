class Solution {
    public boolean isValid(String s) {
        if(s.length()%2==1)
            return false;
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' ||s.charAt(i)=='{' ){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty())
                    return false;
                if(s.charAt(i)==')' && st.pop()!='(')
                    return false;
                else if(s.charAt(i)==']' && st.pop()!='[')
                    return false;
                else if(s.charAt(i)=='}' && st.pop()!='{')
                    return false;
            }
            i++;
            
        }
        if(!st.isEmpty())
            return false;
        return true;

    }
}