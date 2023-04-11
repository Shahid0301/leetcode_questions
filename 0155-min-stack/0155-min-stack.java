class MinStack {
    Stack<Integer> st,st1;
    public MinStack() {
        st=new Stack<>();
        st1=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(!st1.isEmpty())
            if(st1.peek()>val)
                st1.push(val);
            else
                st1.push(st1.peek());
        else
            st1.push(val);
    }
    
    public void pop() {
        st.pop();
        st1.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
       return st1.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */