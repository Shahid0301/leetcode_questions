class Solution {
    public int search(int[] nums, int target) {
        int ind=-1;
        int index=-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                ind=i;
            }
        }
        
        index=search(0,ind,target,nums);
        if(index==-1){
            index=search(ind+1,nums.length-1,target,nums);
            
        }
        
        return index;
    }
        
    public int search(int si,int ei,int m,int[] arr){
			while(si<=ei){
				int mid=(si+ei)/2;
				if(arr[mid]==m){
					return mid;
				}
				if(arr[mid]>m){
					ei=mid-1;
				}
				if(arr[mid]<m){
					si=mid+1;
				}
			}
			return -1;
    }
        
}