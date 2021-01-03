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

    if (isFinish(chk, item.root)) {
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
// const n = [4];
const edges = [
  [[1,0],[1,2],[1,3]],
  [[3,0],[3,1],[3,2],[3,4],[5,4]],
  [],
  [[0,1]],
]

for (let i in n) {
  // console.log(findMinHeightTrees(n[i], edges[i]));
}

const exceptEdges = [[0,1],[1,2],[0,3],[2,4],[0,5],[4,6],[1,7],[2,8],[3,9],[4,10],[1,11],[3,12],[2,13],[1,14],[8,15],[9,16],[6,17],[8,18],[4,19],[13,20],[19,21],[8,22],[19,23],[23,24],[14,25],[10,26],[3,27],[21,28],[22,29],[6,30],[26,31],[16,32],[15,33],[17,34],[3,35],[14,36],[29,37],[26,38],[34,39],[39,40],[14,41],[20,42],[6,43],[30,44],[9,45],[11,46],[18,47],[3,48],[3,49],[27,50],[12,51],[14,52],[22,53],[30,54],[6,55],[14,56],[12,57],[2,58],[55,59],[24,60],[13,61],[40,62]];
console.log(findMinHeightTrees(63, exceptEdges));
