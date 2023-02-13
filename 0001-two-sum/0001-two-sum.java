class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int arr[]=new int[2];
        while(i<nums.length){
            if(map.containsValue(target-nums[i])){
                arr[0]=i;
                break;
            }
            map.put(i,nums[i]);
            i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==target-nums[i]){
                arr[1]=j;
                break;
            }
        }
        return arr;
    }
}