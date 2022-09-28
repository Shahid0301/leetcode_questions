class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length-1;
        int flag=0;
        if(n==0 && nums[0]!=val){
            return 1;
        }
        if(n==0 && nums[0]==val){
            nums=null;
            return 0;
        }
        while(n>=0){
            if(nums[n]!=val){
                flag=1;
                break;
                
            }
        n--;
        }
        if(flag==0){
            nums=null;
            return 0;
        }
        int i=0;
        int j=nums.length-1;
        int k=1;
        while(i<j){
            if(nums[j]==val){
                j--;
            }
            else if(nums[i]==val){
                nums[i]=nums[j];
                j--;
                
            }
            else{
            i++;
            k++;
            }
            
            
        }
        return k;
    }
}