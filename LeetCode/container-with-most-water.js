// https://leetcode.com/problems/container-with-most-water/

const maxArea = height => {
  let max = 0;
  let left = 0;
  let right = height.length - 1;

  while (left !== right) {
    const w = right - left;
    const h = Math.min(height[left], height[right]);
    max = Math.max(max, w * h);

    if (height[left] > height[right]) right--;
    else left++;
  }

  return max;
}

// input
const heights = [
  [1,8,6,2,5,4,8,3,7],
  [1,1],
  [4,3,2,1,4],
  [1,2,1],
]

heights.forEach(h => console.log(maxArea(h)));
