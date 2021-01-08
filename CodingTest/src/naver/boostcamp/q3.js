function solution(N) {
  const isOdd = (n) => n % 2 === 1;
  const half = parseInt(N/2);
  const result = [];

  if (isOdd(N)) {
      result.push(0);
  }
  for (let i = 1; i <= half; i++) {
      result.push(i);
      result.push(-i);
  }
  return result;
}
