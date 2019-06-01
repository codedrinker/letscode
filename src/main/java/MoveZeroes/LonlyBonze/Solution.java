class Solution {
    public void moveZeroes(int[] nums) {
        /*本题的解题思路就是首先从后往前将所有非0数放入栈中，将所有的数置0，再将栈中元素从前往后赋值给数组*/
	Stack record = new Stack();
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=0){
                record.push(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(record.empty()){
                nums[i]=0;
            }else{
                nums[i]=(int)record.pop();
            }
        }
    }
}

