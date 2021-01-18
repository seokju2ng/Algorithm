// https://leetcode.com/problems/add-binary/

const getNthNumber = (num, n) => {
  const nthChar = +num[num.length - n - 1];
  return isNaN(nthChar) ? 0 : nthChar;
}

const addBinary = (a, b) => {
  const len = Math.max(a.length, b.length);
  let result = "";
  let up = 0;

  for (let i = 0; i <= len; i++) {
    if (i === len && !up) break;
    const ca = getNthNumber(a, i);
    const cb = getNthNumber(b, i);
    const sum = ca + cb + up;

    result = (sum % 2) + result;
    up = parseInt(sum / 2);
  }
  return result;
}

// input
const a = ["11", "1010", "0"];
const b = ["1", "1011", "0"];

for (let i = 0; i < a.length; i++) {
  console.log(addBinary(a[i], b[i]));
}
