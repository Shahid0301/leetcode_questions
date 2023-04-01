//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long N=sc.nextLong();
			
            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for(long num : ans){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Long> factorialNumbers(long N){
        // code here
        ArrayList<Long> list=new ArrayList<>();
        fac(N,list,1,1);
        return list;
    }
    static void fac(long n,ArrayList<Long> list,int i,long prev){
        if(prev>n){
            return;
        }
        prev=prev*i;
        if(prev<=n)
        list.add(prev);
        fac(n,list,i+1,prev);
    }
}