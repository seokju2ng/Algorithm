// https://leetcode.com/problems/integer-to-roman/

const intToRoman = num => {
  let result = "";
  let index = 0;

  const symbolMap = {
    1: "I", 4: "IV", 5: "V", 9: "IX",
    10: "X", 40: "XL", 50: "L", 90: "XC",
    100: "C", 400: "CD", 500: "D", 900: "CM",
    1000: "M",
  }

  const keys = Object.keys(symbolMap).map(k => +k).sort((a,b) => b-a);
  
  while (num > 0) {
    const symbol = keys[index];
    if (num >= symbol) {
      num -= symbol;
      result += symbolMap[symbol];
    } else {
      index++;
    }
  }
  return result;
}

// input 

const nums = [3, 4, 9, 58, 1994];

nums.forEach(num => console.log(intToRoman(num)));
