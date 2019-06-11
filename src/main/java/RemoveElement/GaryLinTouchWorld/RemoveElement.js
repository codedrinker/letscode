/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    var length = nums.length;
    for(let i = 0; i<length ; i++){
        if(nums[i] === val){
            nums.splice(i,1);
            i -=1;
            length -=1;
        }
    }
    return length;
};