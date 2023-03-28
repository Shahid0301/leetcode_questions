class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i=0;
        int j=people.length-1;
        int count=0;
        Arrays.sort(people);
        while(i<=j){
            int sum=people[j];
            if(sum==limit){
                count++;
                j--;
            }
            if(sum<limit){
                sum+=people[i];
                if(sum<=limit){
                    i++;
                    j--;
                    count++;
                }
                else{
                    sum-=people[i];
                    count++;
                    j--;
                }
            }
            
        }
        return count;
    }
}