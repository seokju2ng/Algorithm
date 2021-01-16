// https://leetcode.com/problems/maximum-subarray/

const maxSubArray = nums => {
  let max = nums[0];
  let sum = 0;
  nums.forEach(num => {
    const temp = sum + num;
    sum = Math.max(temp, num);
    max = Math.max(max, sum);
  })
  return max;
}

// input
const nums = [
  [-2,1,-3,4,-1,2,1,-5,4],
  [1],
  [0],
  [-1],
  [-100000],
]

nums.forEach(n => console.log(maxSubArray(n)));
