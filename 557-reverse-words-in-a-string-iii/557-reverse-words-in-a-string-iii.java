class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String Ans="";
        for(int i=0;i<arr.length;i++){
            int j=0;
            int k=arr[i].length()-1;
            char h_arr[]=arr[i].toCharArray();
            while(j<k){
                char temp;
                temp=h_arr[j];
                h_arr[j]=h_arr[k];
                h_arr[k]=temp;
                j++;
                k--;
                
            }
            
            Ans+=(String. valueOf(h_arr)+" ");
        }
        return Ans.trim();
        
    }
}