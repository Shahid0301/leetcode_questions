class Solution {
    public int reverse(int n) {
        int rev;
        if(n<0){
            rev=rever(n*-1)*-1;

                return rev;
        }
        else{
            rev=rever(n);

                return rev;
            
        
    }

    }
        public static int rever(int n){
            int rev=0;
            while(n>0){
                
                if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                    return 0;
                }
                rev=rev*10+n%10;
                n/=10;
            }
            return rev;
    }
}