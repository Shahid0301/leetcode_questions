class Solution {
    static int[] reverse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
        }
    public void rotate(int[][] mat) {
        for(int i=0;i<mat.length;i++)
		{		
            for(int j=0;j<i;j++)
        	{
        	    int temp = mat[j][i];
				mat[j][i] = mat[i][j];
				mat[i][j] = temp;
		        }
            
		}
        for(int i=0;i<mat.length;i++){
            mat[i]=reverse(mat[i]);
        }
    }
}