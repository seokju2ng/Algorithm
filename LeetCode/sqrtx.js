// https://leetcode.com/problems/sqrtx/

const mySqrt = x => {
  return parseInt(Math.sqrt(x));
}

// input
const x = [0, 4, 8];
x.forEach(n => console.log(mySqrt(n)));
