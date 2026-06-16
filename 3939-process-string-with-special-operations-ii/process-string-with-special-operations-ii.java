class Solution {
    public char processStr(String s, long k) {
        // StringBuilder sb = new StringBuilder();
        // for(int i=0;i<s.length();i++)
        // {
        //     char c = s.charAt(i);
        //     if(Character.isLetter(c)){
        //     sb.append(c);
        //     }else if(c=='*'){
        //         if(sb.length()==0){
        //         continue;
        //         }
        //     sb.deleteCharAt(sb.length()-1);
        //     }else if(c=='#'){
        //     sb.append(sb.toString());
        //     }else if(c=='%'){
        //     sb.reverse();
        //     }
        // }
        // if(sb.length()==0) return '.';
        // if (k < 0 || k >= sb.length()) return '.';
        // return sb.charAt((int)k);
        int n = s.length();
        long[] len = new long[n + 1];

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            long cur = len[i];

            if (Character.isLetter(c)) {
                len[i + 1] = cur + 1;
            } else if (c == '*') {
                len[i + 1] = Math.max(0, cur - 1);
            } else if (c == '#') {
                len[i + 1] = Math.min(Long.MAX_VALUE / 2, cur * 2);
            } else if (c == '%') {
                len[i + 1] = cur;
            }
        }

        long finalLen = len[n];
        if (k < 0 || k >= finalLen) return '.';

        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            long before = len[i];
            long after = len[i + 1];

            if (Character.isLetter(c)) {
                if (k == before) {
                    return c;
                }
            } else if (c == '*') {
                continue;
            } else if (c == '#') {
                if (before > 0) {
                    k %= before;
                }
            } else if (c == '%') {
                k = after - 1 - k;
            }
        }
        return '.';
    }   

}