class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        return element(k,q);
    }
    public static int element(int k,Queue<Integer> q){
        if(q.size()==1){
            return q.remove();
        }
        for(int i=1;i<=k;i++){
            int ele=q.remove();
            if(i!=k){
                q.add(ele);
            }
        }
        return element(k,q);
        
    }
}