class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        int end=nums.length-1;
        for(int i=end;i>0;i--){
            if(nums[i]>nums[i-1]){
                ind=i-1;
                break;
            }
        }
        if(ind!=-1){
            for(int i=end;i>ind;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[ind];
                nums[ind]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        }
        ind++;
        while(ind<end){
            int temp=nums[ind];
            nums[ind]=nums[end];
            nums[end]=temp;
            ind++;
            end--;
        }
        
    }
}