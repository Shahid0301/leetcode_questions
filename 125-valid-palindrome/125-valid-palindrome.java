class Solution {
public boolean isPalindrome(String s) {
            String s1=s.toLowerCase();
            int i=0;
            int j=s.length()-1;
            while(i<j){
                if((122>=s1.charAt(i) && s1.charAt(i)>=97  || s1.charAt(i)>=48 && s1.charAt(i)<=57)){

                }
                else {
                    i++;
                    continue;
                }
                if((122>=s1.charAt(j) && s1.charAt(j)>=97) || s1.charAt(j)>=48 && s1.charAt(j)<=57){
                    if(s1.charAt(i)==s1.charAt(j)){
                        i++;
                        j--;
                        continue;
                    }
                    else{
                        return false;
                    }
                }
                else {
                    j--;
                }

            }
            return true;
        }

}