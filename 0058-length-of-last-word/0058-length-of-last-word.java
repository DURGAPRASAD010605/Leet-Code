class Solution {
    public int lengthOfLastWord(String s) {
        char ar[]=s.toCharArray();
        int i=ar.length-1;
        while(ar[i]==' '){
            i--;
        }
        int count=0;
        while(i!=-1 && ar[i]!=' '){
            count++;
            i--;
        }
        
    return count;    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna