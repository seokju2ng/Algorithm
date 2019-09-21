window.onload = function() {
    console.log(solution(5));
    console.log(solution(6));
    console.log(solution(1));
    console.log(solution(2));
}

function solution(N) {
    var answer = [4, 6];
    for(let i = 2; i < N; i++) {
        answer[i] = answer[i-1] + answer[i-2];
    }
    return answer[N-1];
}