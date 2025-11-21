class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;

        
        int[] st = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            String t = tokens[i];

            
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int b = st[top--];   
                int a = st[top--];   
                int res = 0;

                if (t.equals("+")) res = a + b;
                else if (t.equals("-")) res = a - b;
                else if (t.equals("*")) res = a * b;
                else res = a / b;

                st[++top] = res;  
            }
            else {
                
                st[++top] = Integer.parseInt(t);
            }
        }

        return st[top];  
    }
}
