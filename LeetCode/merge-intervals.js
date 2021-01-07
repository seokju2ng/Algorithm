// https://leetcode.com/problems/merge-intervals/

const merge = (intervals) => {
  const isOverlap = (a, b) => 
    a[0] <= b[1] && b[0] <= a[1];

  const mergeNode = (a, b) => 
    [Math.min(a[0], b[0]), Math.max(a[1], b[1])];

  return intervals.sort((a, b) => a[0] - b[0])
    .reduce((result, iv) => {
      const rv = result[result.length - 1];

      if (!rv || !isOverlap(rv, iv)) {
        result.push(iv);
      } else {
        result[result.length - 1] = mergeNode(rv, iv);
      }
      return result;
    }, []);
}

// input
const intervals = [
  [[1,3],[8,10],[15,18],[2,6]],
  [[1,4],[4,5],[2,3]],
  [[1,2],[7,8],[3,4],[5,6],[2,3]],
]
intervals.forEach(i => console.log(merge(i)));