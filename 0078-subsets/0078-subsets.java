class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> result=new ArrayList<>();
        subsequence(new ArrayList<>(),result,nums,0);
       return result;
    
        
    }
    public static void subsequence(List<Integer> list,List<List<Integer>> result,int[] nums,int i){
        if(i==nums.length){
            result.add(new ArrayList<>(list));
            return ;
        }
        list.add(nums[i]);
        subsequence(list,result,nums,i+1);
        list.remove(list.size()-1);
        subsequence(list,result,nums,i+1);
        
    }
    
}
