window.onload = function() {
    let arr = [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]];
    console.log(solution(arr));
}

function solution(triangle) {
    for(let i = triangle.length-2; i >= 0; i--){
        for(let j = 0; j < triangle[i].length; j++){
            triangle[i][j] = triangle[i][j] + Math.max(triangle[i+1][j], triangle[i+1][j+1]);
        }
    }
    return triangle[0][0];
}
