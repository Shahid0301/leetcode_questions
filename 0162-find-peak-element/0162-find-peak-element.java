class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int strt=0;
        int end=nums.length-1;
        while(strt<=end){
            int mid=strt+(end-strt)/2;
            if(nums[0]>nums[1]){
                return 0;
            }
            if(nums[nums.length-1]>nums[nums.length-2]){
                return nums.length-1;
            }
            if(nums[mid]>=nums[mid-1] && nums[mid]>=nums[mid+1]){
                return mid;
            }
            else if(nums[mid]<nums[mid+1]){
                strt=mid+1;
            }
            else{
                end=end-1;
            }
        }
        return -1;
    }
}