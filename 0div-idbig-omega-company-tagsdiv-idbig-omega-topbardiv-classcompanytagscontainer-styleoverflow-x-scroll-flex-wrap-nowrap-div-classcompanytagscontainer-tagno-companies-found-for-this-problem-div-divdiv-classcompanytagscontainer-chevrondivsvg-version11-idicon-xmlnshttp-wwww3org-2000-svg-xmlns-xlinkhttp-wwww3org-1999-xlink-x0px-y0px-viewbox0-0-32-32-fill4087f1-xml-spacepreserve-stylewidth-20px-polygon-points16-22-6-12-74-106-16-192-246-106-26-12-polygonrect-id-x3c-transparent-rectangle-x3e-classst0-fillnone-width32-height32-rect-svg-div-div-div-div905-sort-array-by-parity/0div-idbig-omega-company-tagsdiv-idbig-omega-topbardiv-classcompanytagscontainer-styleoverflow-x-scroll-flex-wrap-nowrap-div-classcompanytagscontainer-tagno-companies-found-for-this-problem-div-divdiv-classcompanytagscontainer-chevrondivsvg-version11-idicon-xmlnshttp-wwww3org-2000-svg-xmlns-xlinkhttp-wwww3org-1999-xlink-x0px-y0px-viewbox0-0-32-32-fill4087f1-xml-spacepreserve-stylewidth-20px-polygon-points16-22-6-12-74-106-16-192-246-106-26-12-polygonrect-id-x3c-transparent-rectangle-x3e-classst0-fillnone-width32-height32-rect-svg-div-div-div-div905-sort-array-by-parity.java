class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,j=nums.length-1;
        // int arr[]=new int[nums.length];
        while(i<j){
            if(nums[i]%2==1){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j--;
            }
            else{
                i++;
            }
        }
        return nums;
    }
}