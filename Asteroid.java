class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int l = asteroids.length;
        
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i < l; i++){
            boolean flag = true;
                while(!st.isEmpty() && asteroids[i] < 0 && st.peek() > 0) {
                    if(Math.abs(st.peek()) < Math.abs(asteroids[i])) {
                        st.pop(); 
                        continue;
                    }
                    if(Math.abs(st.peek()) == Math.abs(asteroids[i]))
                        st.pop();
                    flag = false;
                    break;
                }
            if(flag) st.push(asteroids[i]);
        }
            
            
        int arr[] = new int[st.size()];
        for(int i = st.size(); i > 0; i-- )
            arr[i-1] = st.pop();
        return arr;
    }
}