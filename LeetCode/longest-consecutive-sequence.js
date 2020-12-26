// https://leetcode.com/problems/longest-consecutive-sequence/

const longestConsecutive = nums => {
    const set = new Set(nums);  // 중복 제거
    let result = 0;             // 가장 긴 길이를 저장할 변수

    set.forEach(num => {  // set을 돌면서 연속된 순열의 시작 원소를 찾음
      if (set.has(num - 1)) return; // 나보다 1 작은 수가 있으면 일 안함

      let tempLength = 1;
      let tempNum = num + 1;

      while (set.has(tempNum)) {  // 나보다 1 큰 수가 있으면
        tempLength++; // 길이 1 증가
        tempNum++;    // 숫자 1 증가
      }

      result = Math.max(result, tempLength); // 가장 긴 길이를 넘었으면 값 변경
    })
    return result;
};

// input
const nums = [
  [100,4,200,1,3,2],
  [0,3,7,2,5,8,4,6,0,1],
];

for(let i = 0; i < nums.length; i++) {
  console.log(longestConsecutive(nums[i]));
}
