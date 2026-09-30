class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] res = new int[n];
        int o = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (seq.charAt(i) == '(') {
                res[i] = o;
                o = 1 - o;
            } else {
                res[i] = c;
                c = 1 - c;
            }
        }
        return res;
    }
}