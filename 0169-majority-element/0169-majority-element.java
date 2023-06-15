class Solution {
    public int majorityElement(int[] nums) {
        int num=nums[0];
        int cntr=0;
        int len=nums.length;
        int i=0;
        while(i<len){
            if(nums[i]==num){
                cntr++;
            }
            else if(cntr==0){
      
                    num=nums[i];
                    
            }
            else{
                cntr--;
            }
            i++;
        }
        return num;
    }
}