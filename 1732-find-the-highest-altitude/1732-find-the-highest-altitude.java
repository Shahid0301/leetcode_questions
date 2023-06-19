class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int psum=0;
        for(int i=0;i<gain.length;i++){
            psum=psum+gain[i];
            max=Math.max(psum,max);
            
        }
        return max;
    }
}