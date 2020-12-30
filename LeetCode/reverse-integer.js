// https://leetcode.com/problems/reverse-integer/

const isSignedIntegerRange = x => {
  const minValue = -Math.pow(2, 31);
  const maxValue = -minValue - 1;
  return x >= minValue && x <= maxValue;
}

const reverse = x => {
  const isNegative = x < 0;
  const reverseNumber = String(Math.abs(x)).split("").reverse().join("");
  const sign = isNegative ? "-" : "";
  const result = Number(sign + reverseNumber);
  return isSignedIntegerRange(result) ? result : 0;
}

// input
const x = [123, -123, 120, 0, 1534236469];

x.forEach(e => {
  console.log(reverse(e));
});
