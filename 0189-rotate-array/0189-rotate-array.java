class Solution {
    public static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k=k%len;
        reverse(nums,len-k,len-1);
        reverse(nums,0,len-k-1);
        reverse(nums,0,len-1);
        
        
    }
}