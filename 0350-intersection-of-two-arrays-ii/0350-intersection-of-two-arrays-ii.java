class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        ArrayList<Integer> arr=new ArrayList<>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++){
            hash.put(nums1[i],hash.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<m;i++){
            if(hash.containsKey(nums2[i]) && hash.get(nums2[i])>0){
                arr.add(nums2[i]);
                hash.put(nums2[i],hash.get(nums2[i])-1);
            }
            
        }
        int result[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            result[i]=arr.get(i);
        }
        return result;
    }
}