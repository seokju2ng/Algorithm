function solution(a, b) {
  const reverse = str => str.split('').reverse().join('');
  const reverseA = reverse(a);
  const reverseB = reverse(b);
  const maxLength = Math.max(reverseA.length, reverseB.length);
  let answer = '';
  let upNum = 0;
  for (let i = 0; i < maxLength; i++) {
    const anum = !reverseA[i] ? 0 : Number(reverseA[i]);
    const bnum = !reverseB[i] ? 0 : Number(reverseB[i]);
    const sum = anum + bnum;
    answer += sum % 10 + upNum;
    // console.log(sum % 10 + upNum);
    upNum = parseInt(sum / 10);
    // console.log(answer, upNum);
  }
  if (upNum !== 0) answer += upNum;
  return reverse(answer);
}


console.log(solution('123', '98'), '221');
console.log(solution('102', '989'), '1091');
console.log(
  solution('2813928498324982342494239423890442423', '999199328448234399938449840038934324328'),
  '1002013256946559382280944079462824766751'
);