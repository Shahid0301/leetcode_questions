class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int arr[]=new int[nums1.length];
        int flag=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    flag=1;
                }
                if(flag==1){
                    if(nums2[j]>nums1[i]){
                        st.push(nums2[j]);
                        break;
                }
                else{
                    continue;
                }
                }
            }
            flag=0;
            if(!st.isEmpty())
                 arr[i]=st.pop();
            else
                arr[i]=-1;
        }
        return arr;
    }
}