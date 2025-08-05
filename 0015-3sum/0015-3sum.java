class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      HashSet<Integer> tempSet = new HashSet<>();
      for (int j = i + 1; j < n; j++) {
        if (tempSet.contains(-(nums[i] + nums[j]))) {
          List<Integer> tempList = Arrays.asList(nums[i], nums[j], -(nums[i] + nums[j]));
          tempList.sort(null);
          set.add(tempList);
        }
        tempSet.add(nums[j]);
      }
    }
    List<List<Integer>> list = new ArrayList<>(set);
    return list;
    }
}