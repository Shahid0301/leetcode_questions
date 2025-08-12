class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=m-1;
        int p2=0;
        while(p1>=0 && p2<n){
            if(nums1[p1]>nums2[p2]){
               
                int temp=nums1[p1];
                nums1[p1]=nums2[p2];
                nums2[p2]=temp;
                p1--;
                p2++;
            }
            else{
                break;
            }
        }
        Arrays.sort(nums1,0,m);
        Arrays.sort(nums2);
        for(int i=m ;i<m+n;i++){
            nums1[i]=nums2[i-m];
        }

    }
}