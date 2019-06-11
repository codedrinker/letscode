package RemoveElement.zhanweta;

public class RemoveElement {
    public static void main(String [] args){
        int [] nums = {3,2,2,3};
        System.out.print(removeElement(nums,3));
    }
    public static int removeElement(int[] nums,int val){
       int pos = -1;
       for(int i = 0, len = nums.length  ; i<len; i++){
           if(nums[i] != val) {
               pos++;
               nums[pos] = nums[i];
           }
       }
       return pos+1;
    }
}
