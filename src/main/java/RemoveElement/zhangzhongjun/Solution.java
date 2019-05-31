class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=0;
        for(;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
	
   public static void main(String[] args){
	int nums[]={2,3,2,3};
	Solution solution = new Solution();
	System.out.println(solution.removeElement(nums,3));
   }
}