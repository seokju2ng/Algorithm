// https://leetcode.com/problems/longest-consecutive-sequence/

const longestConsecutive = nums => {
  // 데이터 중복 제거 후 정렬
  const sortedSet = Array.from(new Set(nums)).sort((a, b) => a - b);

  let tempLength = 1;       // 연속 길이 저장용 변수
  let tempNum = undefined;  // 이전 숫자 저장용 변수

  return sortedSet.reduce((longestLength, num) => {
    // 연속된 숫자라면 1 증가, 아니라면 1로 초기화
    tempLength = tempNum + 1 === num ? tempLength + 1 : 1;
    // 이전 숫자 저장
    tempNum = num;
    // 두 변수 중 더 큰 수를 저장
    return Math.max(longestLength, tempLength);
  }, 0);
};


// input
const nums = [
  [100,4,200,1,3,2],
  [0,3,7,2,5,8,4,6,0,1],
];

for(let i = 0; i < nums.length; i++) {
  console.log(longestConsecutive(nums[i]));
}
