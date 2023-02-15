class Solution {
    public int maxProfit(int[] nums) {
        int profit=0;
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                }
            else{
                profit=profit<nums[i]-min?nums[i]-min:profit;
            }
        }
        
        
        return profit;
    }
}