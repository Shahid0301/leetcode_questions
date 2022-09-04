class Solution {
    public int search(int[] arr, int m){
        			int si=0;
			int ei=arr.length-1;
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