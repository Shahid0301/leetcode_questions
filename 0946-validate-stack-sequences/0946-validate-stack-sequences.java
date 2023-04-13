class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int i=1;
        int j=0;
        st.push(pushed[0]);
        while(i<pushed.length){
            
            if(!st.isEmpty() &&st.peek()==popped[j]){
                st.pop();
                j++;
            }
            else{
                st.push(pushed[i]);
                    i++;
            }
                
            
        }

        while(j<popped.length){
            if(st.peek()==popped[j]){
                st.pop();
            }
            j++;
        }

   
        if(st.isEmpty())
            return true;
        return false;
        
    }
}