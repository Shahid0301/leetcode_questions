class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int f = 0;

        ArrayList list = new ArrayList();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsValue(nums1[i])) {
                continue;
            } else {
                map.put(f, nums1[i]);
                f++;
            }
        }

        for (int i=0;i<nums2.length; i++) {
            if (map.containsValue(nums2[i]) && !list.contains(nums2[i])) {
                list.add(nums2[i]);
            }

        }
        int a[] = new int[list.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (list.get(i));
        }
        return a;
    }
}