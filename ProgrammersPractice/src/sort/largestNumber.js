window.onload = function() {
  var numbers1 = [6,10,2];
  var numbers2 = [3,30,34,5,9];
  var numbers4 = [0, 0, 0];
  console.log(solution(numbers1));
  console.log(solution(numbers2));
  console.log(solution(numbers4));
}

function solution(numbers) {
    var answer = numbers.sort(fSort).join("");
    if(answer[0] == 0) return '0';
    return answer[0] === '0' ? '0' : answer;
}

var fSort = function (a, b){
  let ab = "" + a + b;
  let ba = "" + b + a;
  return ba - ab;
}
