class Solution {
    public void nextPermutation(int[] nums) {
        int ind1=-1;
        int ind2;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i+1]>nums[i]){
                ind1=i;
                break;
            }
        
        }
    if(ind1!=-1){
            for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[ind1]){
                int temp=nums[ind1];
                nums[ind1]=nums[i];
                nums[i]=temp;
                break;
            }
        }
    }
        System.out.println(ind1);
        ind2=nums.length-1;
        ind1++;
        while(ind1<ind2){
             int temp=nums[ind1];
                nums[ind1]=nums[ind2];
                nums[ind2]=temp;
            ind1++;
            ind2--;
        }
        
    }
}