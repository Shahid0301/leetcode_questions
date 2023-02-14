class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==prev){
                count++;
                if(count>nums.length/2){
                    prev=nums[i];
                    break;
                }
            }
            else{
                count=1;
                prev=nums[i];
            }
        }
        return prev;
    }
}