class Solution {
  
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
        
    }
    public int mergesort(int[] arr, int low,int high){
        int count=0;
        if(low>=high){
            return count;
        }
        int mid=(high+low)/2;
        count+=mergesort(arr,low,mid);
        count+=mergesort(arr,mid+1,high);
        count+=merger(arr,low,mid,high);
        return count;
    }
    public int merger(int[] arr,int low,int mid ,int high){
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        int left=low;
        int right=mid+1;
        for(int i=left;i<=mid;i++){
            while(right<=high && (long)arr[i]>2L*arr[right]){
                right++;
            }
                count=count+(right-(mid+1));
        }
        left=low;
        right=mid+1;
        while(left<=mid && right<=high){
           
            if(arr[left]<arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=list.get(i-low);
        }
        return count;
    }
}