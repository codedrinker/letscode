class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        for(int i=0; i<nums.size(); i++)
        {
            //当遇到0元素时，往后找到第一个非0的数与之互换
            if(nums[i] == 0)
            {
			    int j = i;
			    while(nums[j++] == 0 && j<nums.size());
			    nums[i] = nums[j-1];
			    nums[j-1] = 0;
            }
        }
    }
};
