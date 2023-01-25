class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=start_index(nums,target);
        int end=end_index(nums,target);
        int arr[]=new int[2];
        arr[0]=start;
        arr[1]=end;
        return arr;
    }
    public int start_index(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                index=mid;
                end=end-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=end-1;
            }
            }
        return index;
        }
        public int end_index(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                index=mid;
                start=start+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=end-1;
            }
            }
        return index;
        }
}