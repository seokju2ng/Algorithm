// https://leetcode.com/problems/basic-calculator-ii/

const calculate = s => {
  const regexp = /\d+|[+\-*\/]/g;
  const formula = s.match(regexp);
  const stack = [];
  let operator = "+";
  let value = 0;

  while (formula.length) {
    const temp = formula.shift();

    switch (temp) {
      case "+": case "-": case "*": case "/": 
        operator = temp;
        continue;
    }
    
    switch (operator) {
      case "+": value = +temp;                  break;
      case "-": value = -temp;                  break;
      case "*": value = stack.pop() * temp;     break;
      case "/": value = ~~(stack.pop() / temp); break;
    }
    stack.push(value);
  }
  return stack.reduce((res, cur) => res + cur, 0);
}

// input
const str = [
  "3+2*2",
  " 3/2 + 3/2",
  " 3+5 / 2 ",
  " 123* 23 - 2 / 2 ",
  "0*1",
]

str.forEach(s => console.log(calculate(s)));
