// https://leetcode.com/problems/unique-binary-search-trees-ii/

function TreeNode(val, left, right) {
  this.val = (val === undefined ? 0 : val)
  this.left = (left === undefined ? null : left)
  this.right = (right === undefined ? null : right)
}

const generateTrees = n => {
  if (n === 0) return [];

  const getAllTrees = (start, end) => {
    if (start > end) {
      return [null];
    }
    
    const trees = [];

    for (let i = start; i <= end; i++) {
      const leftAllTrees = getAllTrees(start, i-1);
      const rightAllTrees = getAllTrees(i+1, end);
      
      leftAllTrees.forEach(left => {
        rightAllTrees.forEach(right => {
          trees.push(new TreeNode(i, left, right));
        })
      })
    }
    return trees;
  }
  
  return getAllTrees(1, n);
}


// input (0 <= n <= 8)
const inputs = [0, 2, 3];
inputs.forEach(input => console.log(generateTrees(input)));
