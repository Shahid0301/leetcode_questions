//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int nums[], int size)
    {
        int cnt=0;
        int ele=nums[0];
        for(int i=0;i<nums.length;i++){
            if(ele==nums[i]){
                cnt++;
            }
            else if(cnt==0){
                ele=nums[i];
            }
            else{
                cnt--;
            }
            
        }
        cnt=0;
        for (int i = 0; i < size; i++) {
            if (nums[i] == ele)
                cnt++;
        }
        if(cnt>size/2){
            return ele;
        }
        return -1;
    }
}