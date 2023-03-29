class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            al.add(i);
            }

        return element(al,k,0);
    }
    public static int element(ArrayList<Integer> al,int k,int i){
        if(al.size()==1){
            return al.remove(0);
        }
        i=(k-1+i)%al.size();
        al.remove(i);
        return element(al,k,i);
    }
}