class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int ele=nums[0];
        for(int i=0;i<nums.length;i++){
            if(ele==nums[i]){
                cnt++;
            }
            else if(cnt==0){
                ele=nums[i];
            }
            else{
                cnt--;
            }
            
        }
        return ele;
    }
}