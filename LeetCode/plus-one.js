// https://leetcode.com/problems/plus-one/

const plusOne = digits => {
  let up = 1;
  for (let i = digits.length-1; i >= 0; i--) {
    const temp = digits[i] + up;
    up = parseInt(temp / 10);
    digits[i] = temp % 10;
  }
  if (up) digits.unshift(up);
  return digits;
}

// input
const digits = [
  [1,2,3],
  [4,3,2,1],
  [9,9,9],
  [0,0],
  [6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3],
]

digits.forEach(d => console.log(plusOne(d)));
