// https://leetcode.com/problems/container-with-most-water/

const maxArea = height => {
  let max = 0;

  for (let i = 0; i < height.length - 1; i++) {
    for (let j = i + 1; j < height.length; j++) {
      const w = j - i;
      const h = Math.min(height[i], height[j]);
      max = Math.max(max, w * h);
    }
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
