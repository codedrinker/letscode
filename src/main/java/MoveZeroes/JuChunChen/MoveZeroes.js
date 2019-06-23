/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 *  [1,0,0,3,12]
 *  [1,3,0,0,12]
 *  [1,3,12,0,0]
 * 
 */
var moveZeroes = function(nums) {
      let temp = 0;
  let len = nums.length;
  for(let i = 0; i < len; i++){
      if(nums[i] !== 0){
          nums[temp] = nums[i];
          temp++;
      }
  }
  for(; temp < len; temp++){
      nums[temp] = 0;
  }  
};