//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String s)
    {
        // add your code here
                if(s.length()%2==1)
            return false;
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' ||s.charAt(i)=='{' ){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty())
                    return false;
                if(s.charAt(i)==')' && st.pop()!='(')
                    return false;
                else if(s.charAt(i)==']' && st.pop()!='[')
                    return false;
                else if(s.charAt(i)=='}' && st.pop()!='{')
                    return false;
            }
            i++;
            
        }
        if(!st.isEmpty())
            return false;
        return true;
    }
}
