// https://leetcode.com/problems/regular-expression-matching/

const isMatch = (s, p) => {
    const res = new RegExp(p).exec(s);
    if (!res) return false;
    return res[0] === s;
};


// input
const s = ["aa", "aa", "ab", "aab", "mississippi", "query"];
const p = ["a", "a*", ".*", "c*a*b", "mis*is*p*.", "a"];

for(let i = 0; i < s.length; i++) {
  console.log(isMatch(s[i], p[i]));
}
