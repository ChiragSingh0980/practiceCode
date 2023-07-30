class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr.length <3){
            return -1;
        }
        return peak(arr, 0, arr.length-1);
        
    }
    
    int peak(int arr[], int l, int r){
        int mid= (l+r)/2;
        if(r>l){
            
            if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
                return mid;
            }
            
            if(arr[mid]> arr[mid+1]){
                return peak(arr, 0, mid);
            }
            return peak(arr, mid+1, r);
        }
        return -1;
    }
}