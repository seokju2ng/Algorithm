window.onload = function() {
    let participant = [["leo", "kiki", "eden"], ["marina", "josipa", "nikola", "vinko", "filipa"], ["mislav", "stanko", "mislav", "ana"]];
    let completion = [["kiki", "eden"], ["josipa", "filipa", "marina", "nikola"], ["stanko", "ana", "mislav"]];
    for(let i = 0; i < participant.length; i++)
        console.log(solution(participant[i], completion[i]));
};

function solution(participant, completion) {
    let answer = '';
    participant.sort(compString);
    completion.sort(compString);
    for(let i = 0; i < participant.length; i++) {
        if(participant[i] !== completion[i]){
            answer = participant[i];
            break;
        }
    }
    return answer;
}

function compString(a, b) {
    if (a > b) return 1;
    if (b > a) return -1;
    return 0;
}
