class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arrNeg[]=new int[nums.length/2];
        int arrPos[]=new int[nums.length/2];
        int indNeg=0;
        int indPos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                arrNeg[indNeg++]=nums[i];
            }
            else{
                arrPos[indPos++]=nums[i];
            }
        }
        indNeg=0;
        indPos=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=arrPos[indPos++];
            }
            else{
                nums[i]=arrNeg[indNeg++];
            }
        }
        return nums;
    }
}