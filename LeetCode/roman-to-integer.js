// https://leetcode.com/problems/roman-to-integer/

const romanToInt = s => {
  let result = 0;
  let index = 0;

  const symbolMap = {
    M: 1000,
    CM: 900, D: 500, CD: 400, C: 100,
    XC: 90, L: 50, XL: 40, X: 10,
    IX: 9, V: 5, IV: 4, I: 1,
  }

  const keys = Object.keys(symbolMap);

  while (s.length) {
    const symbol = keys[index];
    const temp = s.substr(0, symbol.length);
    if (symbol === temp) {
      s = s.substr(symbol.length);
      result += symbolMap[symbol];
    } else {
      index++;
    }
  }
  return result;
}

// input

const strs = ["III", "IV", "IX", "LVIII", "MCMXCIV"];
strs.forEach(s => console.log(romanToInt(s)));
