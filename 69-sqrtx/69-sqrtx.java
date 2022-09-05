class Solution {
    public int mySqrt(int a) {
            long si=1;
            long ei=a;
        if(a==0){
            return 0;
        }
            while(si<=ei){
                    long mid=(si+ei)/2;
                    if(mid*mid==a || ( mid*mid<a && (mid+1)*(mid+1)>a)){
                            return (int)mid;
                            
                    }
                    if(mid*mid>a){
                            ei=mid-1;
                    }
                    if(mid*mid<a){
                            si=mid+1;
                    }
            }
        return -1;
    }
}