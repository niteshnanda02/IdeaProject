package codes;

public class Stock {
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{3,2,6,5,0,3}));
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n<2)
            return 0;
        int i=0,j=n-1;
        int min=prices[i],max=prices[j];
        while(i<j){
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[j]);
            i++;
            j--;
        }
        if(n%2!=0){
            if(min>prices[n/2])
                min=prices[n/2];
            else if(max<prices[n/2]){
                max=prices[n/2];
            }

        }
        if(max-min<0)
            return 0;
        return max-min;
    }
}
