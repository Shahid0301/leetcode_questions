class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<n;i++){
            if(n==Math.pow(2,i)){
                return true;
            }
            if(Math.pow(2,i)>n){
                break;
            }
        }
        return false;
        
    }
}