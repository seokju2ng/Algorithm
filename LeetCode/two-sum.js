// https://leetcode.com/problems/two-sum/

const twoSum = (nums, target) => {
  for (let i = 0; i < nums.length; i++)
    for (let j = i + 1; j < nums.length; j++)
      if (nums[i] + nums[j] === target) return [i, j];
};

// input

const nums = [
  [2, 7, 11, 15],
  [3, 2, 4],
  [3, 3],
];
const target = [9, 6, 6];

for (const i in nums) {
  console.log(twoSum(nums[i], target[i]));
}