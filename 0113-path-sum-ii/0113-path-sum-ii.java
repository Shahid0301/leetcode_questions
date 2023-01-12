
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum)
    {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        findSum(root,targetSum,list,l,0);
        return list;
    }
    public void findSum(TreeNode root,int t,List<List<Integer>> list,List<Integer> l,int  sum)
    {
        // if(sum>t)return;
        if(root==null)return;
        if(root.left==null && root.right==null)
        {
            sum+=root.val;
            if(sum==t) 
            {
                System.out.println("Yes");
                l.add(root.val);
                list.add(new ArrayList<>(l));
                l.remove(l.size()-1);
            }
            for(int i: l)
               System.out.print(i+" ");  
            System.out.println();
            return;
        }
        l.add(root.val);
        findSum(root.left,t,list,l,sum+root.val);
        findSum(root.right,t,list,l,sum+root.val);
        l.remove(l.size()-1);
    }
}