class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int [] remaining = new int[n];
        for(int i=0;i<n;i++){
            remaining[i]=capacity[i]-rocks[i];
        }
        int total = 0;
        // int l = 0;
        // int remain = additionalRocks;
        // while(remain>=0 && l<remaining.length){
        //     if(remaining[l]==0) total++;
        //     if(remaining)
        // }
        Arrays.sort(remaining);
        int l = 0;
        int remain = additionalRocks;
        while(remain>=0 && l<remaining.length){
            if(remaining[l]==0) total++;
            if(remaining[l]!=0 && remain>=remaining[l]){
                remain = remain - remaining[l];
                total++;
            }
            l++;
        }
        return total;
    }
}