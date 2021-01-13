// https://leetcode.com/problems/minimum-path-sum/

const minPathSum = grid => {
  const INF = 40000;
  const m = grid.length;
  const n = grid[0].length;

  for (let i = 0; i < m; i++) {
    for (let j = 0; j < n; j++) {
      if (i === 0 && j === 0) continue;
      const up = i === 0 ? INF : grid[i-1][j];
      const left = j === 0 ? INF : grid[i][j-1];
      grid[i][j] += Math.min(left, up);
    }
  }
  return grid[m-1][n-1];
}

// input

const grids = [
  [[1,3,1],[1,5,1],[4,2,1]],
  [[1,2,3],[4,5,6]],
]
grids.forEach(grid => console.log(minPathSum(grid)));
