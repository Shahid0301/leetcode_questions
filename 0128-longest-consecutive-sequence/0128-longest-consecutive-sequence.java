class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int streak=0;
        for(int num:nums){
            set.add(num);
        }
        for(int num:nums){
            if(!set.contains(num-1)){
                int currentStreak=1;
                int currNum=num;
                while(set.contains(++currNum)){
                    currentStreak++;
                }
                streak=Math.max(streak,currentStreak);
            }
        }
        return streak;
    }
}