class Solution {
    public static boolean checkpalidrome(String res){
        int left=0;
        int right=res.length()-1;
        while(left<right){
            if(res.charAt(left)!=res.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        StringBuilder sh=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)||Character.isDigit(ch)){
                sh.append(ch);
            }
        }
            String res=sh.toString();
            res=res.toLowerCase();
            if(checkpalidrome(res)){
                return true;
            }
            else{
               return false;
            }
        }
}
   
