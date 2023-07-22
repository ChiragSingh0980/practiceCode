class Solution {
    Map<Integer, String> mp = new HashMap<>();
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        
        mp.put(2, "abc");
        mp.put(3, "def");
        mp.put(4, "ghi");
        mp.put(5, "jkl");
        mp.put(6, "mno");
        mp.put(7, "pqrs");
        mp.put(8, "tuv");
        mp.put(9, "wxyz");
        recur(digits, 0, new ArrayList<Character>());
        return ans;
        // mp.put(2, "abc");
    }
    void recur(String digits, int i, ArrayList<Character> ls){
        if(i == digits.length()){
            if(ls.size() > 0) {
                String s = "";
                for(char c : ls) s += c;
                ans.add(s);
            }
            return;
        }
        String s = mp.get(digits.charAt(i) - '0');
        for(int j = 0; j < s.length(); j++){
            ls.add(s.charAt(j));
            recur(digits, i+1, ls);
            ls.remove(ls.size()-1);
        }
    }
}