class MyStack {
    Queue<Integer> q1;

    public MyStack() {
        q1=new LinkedList<Integer>();
        
    }
    
    public void push(int x) {
        int i=1;
        q1.add(x);
        while(!q1.isEmpty() && i<q1.size()){
            i++;
            int data=q1.remove();
            q1.add(data);
        }
        
        
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        if(q1.isEmpty())
            return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */