class Solution {
    public static boolean binary(int[] arr,int target){
        int strt=0;
        int end=arr.length-1;
        while(strt<=end){
            int mid=strt+(end-strt)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]<target){
                strt=mid+1;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=-1;
        for(int i=0;i<matrix.length-1;i++){
            if(matrix[i+1][0]>target){
                m=i;
                break;
            }
        }
       if(m==-1){
           m=matrix.length-1;
       }
        return binary(matrix[m],target);
}
}