// https://leetcode.com/problems/climbing-stairs/

const climbStairs = n => {
  const dp = [1, 1];

  for (let i = 2; i <= n; i++) {
    dp[i] = dp[i-1] + dp[i-2];
  }
  return dp[n];
}

// input
const n = [2, 3, 5];
n.forEach(s => console.log(climbStairs(s)));
