class Solution {
    public boolean rotateString(String s, String goal) {

        //your code goes here
        if(s.length()!=goal.length())
        return false;
        String doubleS=s+s;
        return doubleS.contains(goal);
   
    }
}
