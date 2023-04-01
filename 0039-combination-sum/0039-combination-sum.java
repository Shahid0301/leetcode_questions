class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resList=new ArrayList<>();
        combination(0,resList,candidates,target,new ArrayList<>());
        return resList;
    }
    static void combination(int i,List<List<Integer>> resList,int[] candidates,int target,List<Integer> list){
        if(i==candidates.length){
            if(target==0){
                resList.add(new ArrayList<>(list));
            }
            return ;
        }
        if(candidates[i]<=target){    
        list.add(candidates[i]);
        combination(i,resList,candidates,target-candidates[i],list);
        list.remove(list.size()-1);
   
        }
        combination(i+1,resList,candidates,target,list);
        
    }
}