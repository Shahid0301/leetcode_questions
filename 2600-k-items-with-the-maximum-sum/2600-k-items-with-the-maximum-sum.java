class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(numOnes>=k)
            return k;
        if(numOnes<k && numOnes+numZeros>=k)
            return numOnes;
        else{
            k=k-(numOnes+numZeros);
            return numOnes-k ;
        }
       
    }
}