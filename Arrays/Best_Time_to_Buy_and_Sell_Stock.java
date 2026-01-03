class Solution {
    public int maxProfit(int[] prices) {
        int min= prices[0];
        int max=0;
        int minIndex=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                minIndex=i;
            }
            }
            for( int j=minIndex;j<prices.length;j++){
                if(prices[j]>max){
                    max=prices[j];
                }
            }       
        if(max>min){
                return max-min;
            }
            else{
                return 0;
            }       
    }
}