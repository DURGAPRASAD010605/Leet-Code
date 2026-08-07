class Solution {
    public int maxProduct(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
        arr[i] = s.charAt(i) - '0';
        }
        Arrays.sort(arr);
        
        return arr[arr.length-1]*arr[arr.length-2] ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna