// https://leetcode.com/problems/regular-expression-matching/

const isMatch = (s, p) => !!new RegExp(`^${p}$`).exec(s);


// input
const s = ["aa", "aa", "ab", "aab", "mississippi", "query"];
const p = ["a", "a*", ".*", "c*a*b", "mis*is*p*.", "a"];

for(let i = 0; i < s.length; i++) {
  console.log(isMatch(s[i], p[i]));
}
