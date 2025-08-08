class Solution {
    public List<Integer> majorityElement(int[] nums) {
         List<Integer> ans = new ArrayList<>();

    int n = nums.length;
    int min = n / 3;

    Arrays.sort(nums);
    int count=1;
    for (int i = 1; i <= n; i++) {
        if(i<n && nums[i]==nums[i-1]){
            count++;
        }
        else{
            if(count>min){
                ans.add(nums[i-1]);
            }
            count=1;
        }
    }

    return ans;
    }
}