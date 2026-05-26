class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character,Character> map = new HashMap<>();
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(Character.isUpperCase(c)){
                map.put(c,Character.toLowerCase(c));
            }else{
                map.put(c,Character.toUpperCase(c));
            }
        }
        boolean [] arr = new boolean[26];
        int missing = 0;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(Character.isUpperCase(c)){
                int position = c - 'A';
                if(map.containsKey(Character.toLowerCase(c)) && arr[position]==false ){
                    arr[position]=true;
                    missing++;
                }
            }else{
                int pos = c - 'a';
                if(map.containsKey(Character.toUpperCase(c)) && arr[pos]==false){
                    arr[pos]=true;
                    missing++;
                }
            }
        }
        return missing;
    }
}