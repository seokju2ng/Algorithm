function solution(A) {
  const prevValue = A.shift();
  let count = 1;
  let maxSize = 1;
  let result = 0;
  let tempIdx = 0;

  A.reduce((prev, cur, idx) => {
      if (cur > prev) {
          count++;
      } else {
          if (maxSize < count) {
              maxSize = count;
              result = tempIdx;
          }
          tempIdx = idx + 1;
          count = 1;
      }
      return cur;
  }, prevValue);

  return maxSize > count ? result : tempIdx;
}
