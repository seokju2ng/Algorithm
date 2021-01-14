// https://leetcode.com/problems/length-of-last-word/

const lengthOfLastWord = s => {
  let count = 0;
  for (let i = s.length-1; i >= 0; i--) {
    if (!count && s[i] === ' ') continue;
    if (s[i] === ' ') break;
    count++;
  }
  return count;
}

// input
const strs = ["Hello World", " ", "a ", "b   a    "];

strs.forEach(s => console.log(lengthOfLastWord(s)));
