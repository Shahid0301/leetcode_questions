class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=1;
        int k=1;
        while(i<=j && j<nums.length){
            if(nums[j]==nums[i-1]){
                j++;
            }
            else{
                nums[i]=nums[j];
                i++;
                j++;
                k++;
            }
        
        }
        return k;
    }
}