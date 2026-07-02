class Solution {
  boolean isLetterOrDigit(char ch) {
        if((ch >= '0' && ch<='9') || (Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z')){
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        int n = s.length();
        int str = 0;
        int end = n-1;
  
        while(str<end){
            if(!isLetterOrDigit(s.charAt(str))){
                str++;
            }
            else if(!isLetterOrDigit(s.charAt(end))){
                end--;
            }
            else if(Character.toLowerCase(s.charAt(str))==Character.toLowerCase(s.charAt(end))){
                str++;
                end--;
            }else{
                return false;
            }
        }
        return true;

    }
}