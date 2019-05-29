/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
// 执行用时 : 80 ms, 在Move Zeroes的JavaScript提交中击败了99.23% 的用户
// 内存消耗 : 35.6 MB, 在Move Zeroes的JavaScript提交中击败了58.10% 的用户

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