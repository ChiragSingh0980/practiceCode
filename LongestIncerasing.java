class Solution {
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ls = new ArrayList<>();
		ls.add(arr[0]);
		int len = 1;

		for(int i = 0; i < n; i++){
			if(arr[i] > ls.get(ls.size()-1)){
				ls.add(arr[i]);
				len++;
			}
			else{
				int k = binarySearch(ls, arr[i]);
				ls.set(k, arr[i]);
			}
		}
		return ls.size();
    }
    int binarySearch(ArrayList<Integer> ls, int x){
		int i = 0, j = ls.size();
		while(i < j){
			int mid = (i+j)/2;

			if(ls.get(mid) >= x) j = mid;
			else i = mid+1;
		}
		return i;
	}
}