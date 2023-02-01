class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=1;
        while(j<nums.length){
            if(nums[i-1]!=nums[j]){
                nums[i]=nums[j];
                j++;
                i++;
                }
            else{
                j++;}
            
            }
        return i;
    }
}