class MyQueue {
    Stack <Integer> st = new Stack<>();
    Stack <Integer> hp = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
    while(st.size()>1){
        hp.push(st.pop());
    }
     int x = st.pop();
     while(hp.size()>0){
        st.push(hp.pop());
     }
      return x;
        
    }
    
    public int peek() {
        while(st.size()>1){
        hp.push(st.pop());
    }
     int x = st.peek();
     while(hp.size()>0){
        st.push(hp.pop());
     }
      return x;
    }
    
    public boolean empty() {
        return st.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */