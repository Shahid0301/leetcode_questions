class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0)
            return false;
        long dup=x;
        long rev=0;
        while(dup>0){
            rev=rev*10+(dup%10);
            dup/=10;
            
        }
        if(rev==x)
            return true;
        return false;
    }
};