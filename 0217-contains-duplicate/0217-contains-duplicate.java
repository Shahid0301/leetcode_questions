class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> list=new HashSet<>();
        int i=0;
        while(i<nums.length){
            if(list.contains(nums[i])){
                return true;
            }
            list.add(nums[i]);
            i++;
        }
        return false;
    }
}