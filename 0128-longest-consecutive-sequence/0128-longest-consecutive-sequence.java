class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        Arrays.sort(nums);
        int count=1;
        int ans=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]+1){
                ++count;
            }
            else if(nums[i+1]==nums[i]){
                continue;
            }
            else{
                count=1;
            }
            ans=Math.max(ans,count);
        }
        // if(nums[nums.length-1]==nums[nums.length-2]+1){
        //     ans++;
        // }
        return ans;
    }
}