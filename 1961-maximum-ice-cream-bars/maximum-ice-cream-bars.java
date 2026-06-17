class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int total = 0;
        for(int i=0;i<costs.length;i++){
            if(costs[i]<=coins){
                total++;
                coins=coins-costs[i];
            }
        }
        return total;
    }
}