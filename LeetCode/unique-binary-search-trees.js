// https://leetcode.com/problems/unique-binary-search-trees/

/* 노드 수 n, n일 때 결과값 f(n)
 * n=1 > 1, 
 * n=2 > 2f(1),
 * n=3 > 2f(2) + f(1)*f(1),
 * n=4 > 2f(3) + 2f(1)*f(2),
 * n=5 > 2f(4) + 2f(1)*f(3) + f(2)*f(2),
 * n=6 > 2f(5) + 2f(1)*f(4) + 2f(2)*f(3),
 * n=7 > 2f(6) + 2f(1)*f(5) + 2f(2)*f(4) + f(3)*f(3),
 * n=8 > 2f(7) + 2f(1)*f(6) + 2f(2)*f(5) + 2f(3)*f(4),
 * n=9 > 2f(8) + 2f(1)*f(7) + 2f(2)*f(6) + 2f(3)*f(5) + f(4)*f(4),
 * 
 * 점화식
 * f(0) = 1, f(1) = 1, i = n/2,
 * 짝수일 때, f(n) = 2f(0)f(n-1) + 2f(1)f(n-2) + ... + 2f(i-1)f(i)
 * 홀수일 때, f(n) = 2f(0)f(n-1) + 2f(1)f(n-2) + ... + 2f(i-1)f(i+1) + f(i)^2
*/

const numTrees = n => {
  const storeNumTrees = [1, 1];

  const recursive = n => {
    if (storeNumTrees[n]) return storeNumTrees[n];

    const half = parseInt(n / 2);
    let result = 0;

    for (let i = 0; i < half; i++) {
      result += recursive(i) * recursive(n-i-1) * 2;
    }

    if (n % 2 === 1) {
      result += Math.pow(recursive(half), 2);
    }

    storeNumTrees[n] = result;
    return result;
  }

  return recursive(n);
}

// input
const inputs = [1,2,3,4,5,6,19];

inputs.forEach(input => console.log(numTrees(input)));
