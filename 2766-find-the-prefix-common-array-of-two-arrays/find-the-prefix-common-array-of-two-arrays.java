class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        // int n = A.length;
        // HashMap<Integer,Integer> map   = new HashMap<>();
        // int [] result = new int[n];
        // int index = 0;
        // for(int i=0;i<n;i++){
        //     int total = 0;
        //     if((A[i]==B[i]) && A[i]==i){
        //         total = total + 2;
        //     }
        //     if((A[i]==i && B[i]!=i) || (A[i]!=i &&B[i]==i)){
        //         total = total+1;
        //     }
        //     if(map.containsKey(i)){
        //         total+=map.get(i);
        //     }
        //     map.put(A[i],map.getOrDefault(A[i],0)+1);
        //     map.put(B[i],map.getOrDefault(B[i],0)+1);
        //     result[index] = total;
        //     index++;
        // }
        // return result;
        int n = A.length;
        int [] result = new int[n];
        int [] common = new int[n+1];
        int commonn = 0;
        for(int i=0;i<n;i++){
            common[A[i]]++;
            if(common[A[i]]==2) commonn++;
             common[B[i]]++;
            if(common[B[i]]==2) commonn++;
            result[i]=commonn;
        }
        return result;
    }
}