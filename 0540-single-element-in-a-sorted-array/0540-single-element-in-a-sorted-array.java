class Solution {
    public int singleNonDuplicate(int[] nums) {
        int strt=0,end=nums.length-1,mid;
        if(end==0){
                return nums[0];
            }       
        else if(nums[0]!=nums[1]){
                return nums[0];
            }
        else if(nums[end]!=nums[end-1]){
                return nums[end];
            }
        while(strt<=end){
            mid=strt+(end-strt)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            if((nums[mid]==nums[mid-1] && mid%2==1)||(nums[mid]==nums[mid+1]&& mid%2==0))
                strt=mid+1;
            else
                end=mid-1;
            
        }
        return -1;
    }
}