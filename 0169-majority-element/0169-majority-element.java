class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                map.put(nums[i], count+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int n=nums.length/2;
        for(int i=0;i<nums.length;i++){
           if( map.get(nums[i])>n){
               n=nums[i];
               break;
            }
        }
        return n;
    }
}