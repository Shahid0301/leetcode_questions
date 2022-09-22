class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String Ans="";
        for(int i=0;i<arr.length;i++){
            int j=0;
            int k=arr[i].length()-1;
            char h_arr[]=arr[i].toCharArray();
            while(j<k){
                char temp='s';
                temp=h_arr[j];
                h_arr[j]=h_arr[k];
                h_arr[k]=temp;
                j++;
                k--;
                
            }
            String ans1 = String. valueOf(h_arr);
            
            Ans+=(ans1+" ");
        }
        return Ans.trim();
        
    }
}