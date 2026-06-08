class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
     List<Integer> smaller = new ArrayList<>();
     List<Integer> larger = new ArrayList<>();
     List<Integer> middle = new ArrayList<>();
     for(int i=0;i<nums.length;i++){
        if(nums[i]<pivot){
            smaller.add(nums[i]);
        }else if(nums[i] > pivot){
            larger.add(nums[i]);
        }else{
            middle.add(nums[i]);
        }
     } 
     int [] result = new int[nums.length];
     int l = 0;
     for(int i=0;i<smaller.size();i++){
        result[l] = smaller.get(i);
        l++;
     }
     for(int i=0;i<middle.size();i++){
        result[l] = middle.get(i);
        l++;
     }
     for(int i=0;i<larger.size();i++){
        result[l] = larger.get(i);
        l++;
     }
     return result;
    }
}