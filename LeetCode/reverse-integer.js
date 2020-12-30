// https://leetcode.com/problems/reverse-integer/

const reverse = x => {
  const isNegative = x < 0;
  const str = x + "";
  let result = isNegative ? str.substr(1) : str;
  result = result.split("").reverse().join("");
  result = isNegative ? "-"+result : result;
  return Number(result);
}

// input
const x = [123, -123, 120, 0];

x.forEach(e => {
  console.log(reverse(e));
});
