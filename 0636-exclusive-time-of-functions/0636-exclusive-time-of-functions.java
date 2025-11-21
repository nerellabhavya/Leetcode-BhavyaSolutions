class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
           int[] ans = new int[n];
        int[] stack = new int[logs.size()];
        int top = -1;
        int prevTime = 0;

        for (String log : logs) {
            String[] parts = log.split(":");
            int id = Integer.parseInt(parts[0]);
            String type = parts[1];
            int time = Integer.parseInt(parts[2]);

            if (type.equals("start")) {
                if (top != -1) {
                    ans[stack[top]] += time - prevTime;
                }
                stack[++top] = id;
                prevTime = time;
            } else { 
                ans[stack[top]] += time - prevTime + 1;
                top--;
                prevTime = time + 1;
            }
        }

        return ans;
    }
}
    