class RemoveElement {
	public int removeElement(int[] nums, int val) {	       
		int i=0,j=nums.length-1,count=0;
		while(i<=j){
			if(nums[i]==val){
				while(j>i&&nums[j]==val){
					j--;
					count++;
				}
				if(j==i){
					count++;
					break;
				}else{
					nums[i]=nums[j];
					j--;
					count++;
				}
			}
			i++;
		}
		return nums.length-count;
	}
}
