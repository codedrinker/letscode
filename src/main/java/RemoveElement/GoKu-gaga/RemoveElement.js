/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
  for(let i = 0; i < nums.length; i++) {
      if(nums[i] === val) {
          nums.splice(i, 1);
          i -= 1;
      }
  }
  return nums.length;
};

/** 
 * 执行结果
 * 执行用时 : 76 ms, 在Remove Element的JavaScript提交中击败了96.95% 的用户
 * 内存消耗 : 33.6 MB, 在Remove Element的JavaScript提交中击败了54.51% 的用户
*/