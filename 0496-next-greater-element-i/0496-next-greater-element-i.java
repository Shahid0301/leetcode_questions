class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        int flag=0;
        int ans=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    flag=1;
                }
                if(flag==1){
                    if(nums2[j]>nums1[i]){
                        arr[i]=nums2[j];
                        ans=1;
                        break;
                    }
                    else
                    {
                    continue;
                        }
                }
            }
             if(ans==0){
                 arr[i]=-1;
             }
            flag=0;
           
            ans=0;

        }
        return arr;
    }
}