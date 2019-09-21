window.onload = function() {
  var citations = [3,0,6,1,5];
  // var citations = [3,0,6,4,1,5];
  console.log(solution(citations));
}

function solution(citations) {
    var answer = 0;
    let n = citations.length;
    citations.sort((a,b)=>b-a);
    for(let i = 0; i < n; i++) {
      if(i < citations[i]) answer = i+1;
    }
    return answer;
}
