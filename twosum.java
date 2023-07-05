public class twosum {
    class Solution {
        public:
            
            vector<int> twoSum(vector<int>& nums, int target) {
                int n=nums.size();
                int i=0,value=0;
                vector<int> nums1;
                unordered_map <int, int> contain;
                for(int i=0;i<n;i++){
                    value=target-nums[i];
                    if(contain.count(value)>0){
                        nums1.push_back(contain.at(value));
                        nums1.push_back(i);
                        return nums1;
                    }
                    pair<int,int> p(nums[i],i);
                    contain.insert(p);
                }
                
                return {};
            }
        };
            
}
