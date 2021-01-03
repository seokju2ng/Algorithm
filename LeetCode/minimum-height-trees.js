// https://leetcode.com/problems/minimum-height-trees/

const NOT_FINISH = 100000;

const QItem = class {
  constructor(root, v, len) {
    this.root = root;
    this.v = v;
    this.len = len;
  }
}

const makeMatrix = (n, m, initial) =>
  Array.from(Array(n), () => Array(m).fill(initial));

const makeMap = (n, edges) => {
  const map = makeMatrix(n, n, null);
  for (let e of edges) {
    map[e[0]][e[1]] = true;
    map[e[1]][e[0]] = true;
  }
  return map;
}

const findMinHeightTrees = (n, edges) => {
  const map = makeMap(n, edges);
  const chk = makeMatrix(n, n, null);
  const q = [];
  let min = NOT_FINISH;
  const result = [];

  const isMHT = item => min === item.len && !result.includes(item.root);
  const isFinish = root => {
    for (let c of chk[root]) {
      if (!c) return false;
    }
    return true;
  }

  for (let i = 0; i < n; i++) {
    q.push(new QItem(i, i, 0));
  }

  while (q.length) {
    const item = q.shift();
    chk[item.root][item.v] = true;

    if (min < item.len) break;

    if (isFinish(item.root)) {
      if (min === NOT_FINISH) min = item.len;
      if (isMHT(item)) {
        result.push(item.root);
        continue;
      }
    }
    for (let i = 0; i < n; i++) {
      if (map[item.v][i] && !chk[item.root][i]) {
        q.push(new QItem(item.root, i, item.len + 1));
      }
    }
  }
  return result;
};

// input
const n = [4, 6, 1, 2];
const edges = [
  [[1,0],[1,2],[1,3]],
  [[3,0],[3,1],[3,2],[3,4],[5,4]],
  [],
  [[0,1]],
]

for (let i in n) {
  console.log(findMinHeightTrees(n[i], edges[i]));
}
