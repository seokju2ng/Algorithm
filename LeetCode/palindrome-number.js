// https://leetcode.com/problems/palindrome-number/

const isPalindrome = x => {
  const str = x + "";

  for (let i = 0; i < str.length / 2; i++) {
    if (str[i] !== str[str.length - i - 1]) 
      return false;
  }
  return true;
}

// input
const x = [121, -121, 10, -101];

x.forEach(e => {
  console.log(isPalindrome(e));
});
