class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int ans=Integer.MAX_VALUE;
        int strt=0,end=nums.length-1;
        while(strt<=end){
            if(nums[strt]<nums[end]){
                ans=Math.min(ans,nums[strt]);
                break;
            }
            int mid=strt+(end-strt)/2;
             if(nums[mid]>=nums[strt] ){
                ans=Math.min(nums[strt],ans);
                strt=mid+1;
            }
            else{
                ans=Math.min(nums[mid],ans);
                end=mid-1;
            }
        }
        return ans;
    }
}