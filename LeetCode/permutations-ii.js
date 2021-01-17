// https://leetcode.com/problems/permutations-ii/

const getCount = nums => nums.reduce((count, num) => {
  if (!count[num]) count[num] = 0;
  count[num]++;
  return count;
}, {});

const dfs = (result, count, perm) => {
  const keys = Object.keys(count).map(n => +n);

  if (keys.length === 0) {
    result.push(perm);
    return;
  }

  keys.forEach(key => {
    if (!--count[key]) {
      delete count[key];
    }
    dfs(result, count, [...perm, key]);
    count[key] = count[key] ? count[key] + 1 : 1;
  })
}

const permuteUnique = nums => {
  const count = getCount(nums);
  const result = [];
  dfs(result, count, []);
  return result;
}

// input
const nums = [
  [1,1,2],
  [1,2,3],
  [-2,0,3,5],
  [1,1,1,3],
]

nums.forEach(n => console.log(permuteUnique(n)));
