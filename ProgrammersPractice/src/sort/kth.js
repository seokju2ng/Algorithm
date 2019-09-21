window.onload = function() {
  var array = [1,5,2,6,3,7,4];
  var commands = [[2,5,3],[4,4,1],[1,7,3]];
  console.log(solution(array, commands));
}

function solution(array, commands) {
  let answer = [];
  for(let i in commands) {
    answer.push(array.slice(commands[i][0]-1, commands[i][1]).sort((x,y)=>x-y)[commands[i][2]-1]);
  }
  return answer;
}
