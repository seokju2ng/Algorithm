// https://leetcode.com/problems/subsets/

const subsets = nums => {
  const result = [];
  const n = nums.length;
  let k = 0;

  const backtrack = (sub, idx) => {
    console.log("k", k, "sub", sub, "idx", idx);
    if (sub.length === k) {
      console.log("push", sub);
      result.push([...sub]);
    }

    for (let i = idx; i < n; i++) {
      sub.push(nums[i]);
      backtrack(sub, i + 1);
      sub.length--;
    }
  };

  for (k = 0; k <= n; k++) {
    backtrack([], 0);
  }
  return result;
}

// input
const nums = [
  [1,2,3],
  [0],
];

nums.forEach(n => console.log(subsets(n)));
