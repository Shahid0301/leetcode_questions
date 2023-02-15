class Solution {
    public int[] rearrangeArray(int[] nums) {
        int result[]=new int[nums.length];
        int iNeg=1;
        int iPos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                result[iPos]=nums[i];
                iPos+=2;
            }
            else{
                 result[iNeg]=nums[i];
                iNeg+=2;
            }
        }
        return result;
    }
}