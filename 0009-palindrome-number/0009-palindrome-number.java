class Solution {
    public static boolean isPalindrome(int x) {
        String s=x+"";
        int rev=0;
        int c;
        if(x<0){
            return false;
        }
        if(s.length()%2==0){
            c=s.length()/2;
        }
        else{
            c=s.length()/2+1;
        }
        for(int i=c;i<s.length();i++){
            rev=rev*10+x%10;
            x/=10;
        }
        if(s.length()%2!=0){
            x/=10;
        }
        if(x==rev){
            return true;
        }
        else{
            return false;
        }

    }}