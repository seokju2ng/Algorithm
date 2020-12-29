// https://leetcode.com/problems/longest-palindromic-substring/

String.prototype.reverse = function() {
  return this.split("").reverse().join("");
}

const longestPalindrome = s => {
  let result = "";

  const isLongestPalindrome = s => 
    (s === s.reverse()) && (result.length < s.length);
  

  for (let i = 0; i < s.length; i++) {
    for (let j = i + 1; j <= s.length; j++) {
      const sub = s.substring(i, j);
      
      if (isLongestPalindrome(sub)) {
        result = sub;
      }
    }
  }
  return result;
};

// input
const strs = ["babad", "cbbd", "a", "ac"];

for (const s of strs) {
  console.log(longestPalindrome(s));
}
