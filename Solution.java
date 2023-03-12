class Solution {
    public String removeOuterParentheses(String s) {
        char[] ss = s.toCharArray();
        int count = 0;
        boolean[] visited = new boolean[ss.length];
        Arrays.fill(visited, false);
        for (int i = 0; i < ss.length; i++) {
            if (count == 0) {
                visited[i] = true;
            }
            if (ss[i] == '(') {
                count++;
            } else {
                count--;
                if (count == 0) {
                    visited[i] = true;
                }
            }
        }
        String ans = "";
        for (int i = 0; i < ss.length; i++) {
            if (!visited[i]) {
                ans += ss[i];
            }
        }
        return ans;
    }
}
